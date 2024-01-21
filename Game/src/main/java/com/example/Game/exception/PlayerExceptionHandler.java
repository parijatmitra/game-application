package com.example.Game.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class PlayerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<PlayerExceptionResponse> playerNotFoundException (PlayerException ex, HttpServletRequest req) {
         PlayerExceptionResponse errorResponse = new PlayerExceptionResponse(
                 ZonedDateTime.now(),
                 HttpStatus.NOT_FOUND.value(),
                 req.getRequestURI(),
                 ex.getMessage()
         );
         return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<PlayerExceptionResponse> genericHandler (Exception ex, HttpServletRequest req) {
        PlayerExceptionResponse errorResponse = new PlayerExceptionResponse(
          ZonedDateTime.now(),
          HttpStatus.BAD_REQUEST.value(),
          req.getRequestURI(),
          ex.getMessage()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
