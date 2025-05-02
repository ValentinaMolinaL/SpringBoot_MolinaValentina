package com.adrian.demojpa.infrastructure.error;

import org.springframework.http.HttpStatus;

public class RolDuplicateException extends RuntimeException {

    private String message;
    private HttpStatus status;

    public RolDuplicateException(String message, HttpStatus statusCode)
    {
        super(message);
        this.message = message;
        this.status = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
    
}
