package com.example.demo_hexagonal_architecture.application.dto;

import java.time.LocalDate;

public record NewMovieDto(String title, String description, LocalDate releaseDate, String diretorName) {
}
