package com.example.demo_hexagonal_architecture.adapters.out.postgresJDBC.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(name = "movies", )
public record MovieEntity(

        @Id
        Long id,
        String title,
        String description,
        LocalDate releaseDate,
        String diretorName,

        @Version
        Integer version;
) {
}
