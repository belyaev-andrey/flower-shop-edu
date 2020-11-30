package ru.vsu.csf.group.flowers.exceptions;

public class StoreSearchException extends StoreException {

    public StoreSearchException() {
    }

    public StoreSearchException(String message) {
        super(message);
    }

    public StoreSearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoreSearchException(Throwable cause) {
        super(cause);
    }

    public StoreSearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
