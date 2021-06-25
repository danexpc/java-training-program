package ua.me.training.exception;

public class IncorrectInputOrderException extends RuntimeException {
    public IncorrectInputOrderException(String message) {
        super(message);
    }

    public IncorrectInputOrderException(String message, Throwable cause) {
        super(message, cause);
    }
}
