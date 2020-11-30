package ru.vsu.csf.group.flowers.exceptions;

public class StoreSaveException extends StoreException {

    public StoreSaveException() {
    }

    public StoreSaveException(String message) {
        super(message);
    }

    public StoreSaveException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoreSaveException(Throwable cause) {
        super(cause);
    }

    public StoreSaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
