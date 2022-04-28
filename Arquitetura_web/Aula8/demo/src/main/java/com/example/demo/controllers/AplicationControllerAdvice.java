package com.example.demo.controllers;

import com.example.demo.ApiErrors;
import com.example.demo.exceptions.RegraNegocioException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AplicationControllerAdvice {
    @ExceptionHandler(RegraNegocioException.class)
    public ApiErrors handlerRegraNegocioException(RegraNegocioException ex)
    {
        String msg = ex.getMessage();
        return new ApiErrors(msg);
    }
}
