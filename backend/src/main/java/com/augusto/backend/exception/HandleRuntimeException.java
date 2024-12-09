package com.augusto.backend.exception;

import java.io.Serial;

public class HandleRuntimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public HandleRuntimeException(String message) {
        super(message);
    }
}
