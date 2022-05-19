package me.hfox.iracing.sdk.spring.exception;

public class SdkMessageException extends Exception {

    public SdkMessageException() {
    }

    public SdkMessageException(String message) {
        super(message);
    }

    public SdkMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public SdkMessageException(Throwable cause) {
        super(cause);
    }

}
