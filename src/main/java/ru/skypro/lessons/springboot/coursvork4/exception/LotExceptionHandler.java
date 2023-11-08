package ru.skypro.lessons.springboot.coursvork4.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice

public class LotExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<?>handleSQLException(SQLException sqlException) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
