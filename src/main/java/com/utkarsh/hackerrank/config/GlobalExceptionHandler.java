package com.utkarsh.hackerrank.config;

import com.utkarsh.hackerrank.exception.ResourceNotFoundException;
import com.utkarsh.hackerrank.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleResourceNotFound(ResourceNotFoundException ex) {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), HttpStatus.NOT_FOUND.getReasonPhrase(), false);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}


