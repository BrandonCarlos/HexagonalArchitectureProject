package com.example.demo_hexagonal_architecture.application.usecases;

import com.example.demo_hexagonal_architecture.application.dao.MovieDAO;
import com.example.demo_hexagonal_architecture.application.dto.NewMovieDto;
import com.example.demo_hexagonal_architecture.domain.Movie;
import com.example.demo_hexagonal_architecture.infrastructure.exceptions.MovieAlreadyExistException;
import com.example.demo_hexagonal_architecture.infrastructure.exceptions.MovieNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class MovieUseCase {

    private final MovieDAO movieDAO;

    public String saveMovie(NewMovieDto newMovieDto) throws MovieAlreadyExistException {

        var isPresent = movieDAO.findMovieByTitle(newMovieDto.title()).isPresent();
        if(isPresent) {
            throw new MovieAlreadyExistException("Movies already exist");
        }
        movieDAO.saveMovie(newMovieDto);
        return "Movie Saved Successfully";
    }

    public List<Movie> getAllMovies() {
        return movieDAO.findAllMovies();
    }

    public String updateMovie(Movie movie) throws MovieNotFoundException {
        var isPresent = movieDAO.findMovieByTitle(movie.title()).isPresent();
        if(isPresent) {
            throw new MovieNotFoundException("Movies already exist");
        }
        movieDAO.updateMovie(movie);
        return "Movie Successfully Updated";
    }

    public Movie getMovieByTitle(String movieTitle) {
        return movieDAO.findMovieByTitle(movieTitle).orElseThrow(() -> new MovieNotFoundException("This movie does not exist"));
    }

}
