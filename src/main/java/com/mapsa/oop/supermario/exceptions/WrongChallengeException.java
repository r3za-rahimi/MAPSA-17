package com.mapsa.oop.supermario.exceptions;

public class WrongChallengeException  extends Exception{

    private final Integer code;


    public WrongChallengeException(Integer code) {
        this.code = code;
    }

    public WrongChallengeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public WrongChallengeException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public WrongChallengeException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public WrongChallengeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
