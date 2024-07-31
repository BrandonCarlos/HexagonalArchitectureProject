package com.example.demo_hexagonal_architecture.application.usecases;

import com.example.demo_hexagonal_architecture.application.dao.MovieDAO;
import com.example.demo_hexagonal_architecture.application.dto.NewMovieDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class MovieUseCase {

    private final MovieDAO movieDAO;

    public String saveMovie(NewMovieDto newMovieDto) {

        movieDAO.findMovieByTitle(newMovieDto.title());

        return null;
    }

}
