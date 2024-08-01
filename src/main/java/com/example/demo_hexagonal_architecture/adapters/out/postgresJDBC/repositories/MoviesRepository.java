package com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC.repositories;

import com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC.entities.MovieEntity;
import com.example.demo_hexagonal_architecture.domain.Movie;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepository extends CrudRepository<MovieEntity, Long> {
    @Query("SELECT * FROM movies WHERE title =: title")
    Optional<Movie> findMovieByTitle(@Param("title") String title);
}
