package com.test.db2any.exceptionHandler;

import com.test.db2any.model.Data;
import com.test.db2any.model.DataJsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(org.springframework.dao.EmptyResultDataAccessException.class)
    public ResponseEntity<String> handleDataNotFoundException(org.springframework.dao.EmptyResultDataAccessException exception, WebRequest request) {
        return new ResponseEntity<>(
                DataJsonResponse.
                builder().
                data(new Data()).
                status(HttpStatus.NOT_FOUND).
                requestParam(request.getParameter("key")).
                build().toString(),
                HttpStatus.NOT_FOUND);
    }
}
