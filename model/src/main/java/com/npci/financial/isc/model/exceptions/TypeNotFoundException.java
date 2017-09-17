package com.npci.financial.isc.model.exceptions;

/**
 * Created by h.mohammadi on 9/16/2017.
 */
public class TypeNotFoundException extends RuntimeException {
    public TypeNotFoundException() {
        super();
    }

    public TypeNotFoundException(String message) {
        super(message);
    }

    public TypeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeNotFoundException(Throwable cause) {
        super(cause);
    }

    protected TypeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
