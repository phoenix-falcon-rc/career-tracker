package com.careertracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudySessionNotFoundException.class)
    public ResponseEntity<String> handleStudySessionNotFound(StudySessionNotFoundException s) {
        return new ResponseEntity<>(
                s.getMessage(),
                HttpStatus.NOT_FOUND
        );
    }
}
