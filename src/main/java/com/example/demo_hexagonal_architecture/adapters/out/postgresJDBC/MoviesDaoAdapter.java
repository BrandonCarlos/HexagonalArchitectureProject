package com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC;

import com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC.entities.MovieEntity;
import com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC.repositories.MoviesRepository;
import com.example.demo_hexagonal_architecture.application.dao.MovieDAO;
import com.example.demo_hexagonal_architecture.application.dto.NewMovieDto;
import com.example.demo_hexagonal_architecture.domain.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class MoviesDaoAdapter implements MovieDAO {

    private final MoviesRepository moviesRepository;

    @Override
    public Optional<Movie> findMovieByTitle(String title) {
        return moviesRepository.findMovieByTitle(title);
    }

    @Override
    public List<Movie> findAllMovies() {
        var list = ((List<MovieEntity>) moviesRepository.findAll()).stream().map(movieEntity -> {
            return new Movie(movieEntity.id(), movieEntity.title(), movieEntity.description(), movieEntity.releaseDate(), movieEntity.diretorName());
        }).toList();
        return list;
    }

    @Override
    public void saveMovie(NewMovieDto movie) {
        moviesRepository.save(new MovieEntity(null, movie.title(),  movie.description(), movie.releaseDate(), movie.diretorName(), null));
    }

    @Override
    public void updateMovie(Movie newMovie) {
        moviesRepository.save(new MovieEntity(newMovie.id(), newMovie.title(),  newMovie.description(), newMovie.releaseDate(), newMovie.diretorName(), null));
    }

    @Override
    public void deleteMovie(Movie oldMovie) {

    }
}
