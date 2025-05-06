package com.adrian.demojpa.infrastructure.error;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class RolDuplicateException extends RuntimeException{

    private String message;
    private HttpStatus status;

    public RolDuplicateException(String message, HttpStatus statusCode)
    {
        super(message);
        this.message = message;
        this.status = statusCode;
    } 
}
