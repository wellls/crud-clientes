package com.github.wellls.clients.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Resource not found");
    }

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}