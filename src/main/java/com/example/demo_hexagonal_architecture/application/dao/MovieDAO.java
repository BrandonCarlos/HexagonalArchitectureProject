package com.example.demo_hexagonal_architecture.application.dao;

import com.example.demo_hexagonal_architecture.application.dto.NewMovieDto;
import com.example.demo_hexagonal_architecture.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDAO {

    Optional<Movie> findMovieByTitle(String title);

    List<Movie> findAllMovies();

    void saveMovie(NewMovieDto movie);

    void updateMovie(Movie newMovie);

    void deleteMovie(Movie oldMovie);

}
