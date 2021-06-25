package ua.me.training.exception;

public class NotMatchesWordException extends RuntimeException{
    public NotMatchesWordException(String message) {
        super(message);
    }

    public NotMatchesWordException(String message, Throwable cause) {
        super(message, cause);
    }
}
