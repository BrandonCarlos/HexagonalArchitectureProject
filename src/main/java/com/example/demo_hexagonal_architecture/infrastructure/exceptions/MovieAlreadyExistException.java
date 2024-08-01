package com.example.demo_hexagonal_architecture.infrastructure.exceptions;

public class MovieAlreadyExistException extends RuntimeException {

    public MovieAlreadyExistException(String message) {
        super(message);
    }

}
