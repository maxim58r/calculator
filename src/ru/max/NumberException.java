package ru.max;

public class NumberException extends Exception{
    public NumberException() {
    }

    public NumberException(String message) {
        super(message);
    }

    public NumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberException(Throwable cause) {
        super(cause);
    }

    public NumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
