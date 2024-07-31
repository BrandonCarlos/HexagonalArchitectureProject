package com.example.demo_hexagonal_architecture.domain;

import java.time.LocalDate;

public record Movie(Long id, String title, String description, LocalDate releaseDate, String diretorName) {
}
