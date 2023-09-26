package com.mapsa.oop.supermario.exceptions;

public class WrongLevelException extends RuntimeException{

    public WrongLevelException() {
    }

    public WrongLevelException(String message) {
        super(message);
    }

    public WrongLevelException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLevelException(Throwable cause) {
        super(cause);
    }

    public WrongLevelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
