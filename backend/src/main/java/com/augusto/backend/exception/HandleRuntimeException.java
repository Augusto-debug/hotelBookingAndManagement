package com.augusto.backend.exception;

public class HandleRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1L;
   public HandleRuntimeException(String message) {
        super(message);
    }
}
