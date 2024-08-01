package com.example.demo_hexagonal_architecture.infrastructure.exceptions;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String message) {
        super(message);
    };

}
