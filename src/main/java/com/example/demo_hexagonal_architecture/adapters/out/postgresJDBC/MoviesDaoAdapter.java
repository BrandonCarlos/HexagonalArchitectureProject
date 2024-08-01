package com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC;

import com.example.demo_hexagonal_architecture.application.dao.MovieDAO;
import com.example.demo_hexagonal_architecture.application.dto.NewMovieDto;
import com.example.demo_hexagonal_architecture.domain.Movie;

import java.util.List;
import java.util.Optional;

public class MoviesDaoAdapter implements MovieDAO {

    @Override
    public Optional<Movie> findMovieByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public List<Movie> findAllMovies() {
        return null;
    }

    @Override
    public void saveMovie(NewMovieDto movie) {

    }

    @Override
    public void updateMovie(Movie newMovie) {

    }

    @Override
    public void deleteMovie(Movie oldMovie) {

    }
}
