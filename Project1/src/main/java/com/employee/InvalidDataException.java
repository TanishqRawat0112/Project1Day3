package com.employee;

// Custom unchecked exception with exception chaining
public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
