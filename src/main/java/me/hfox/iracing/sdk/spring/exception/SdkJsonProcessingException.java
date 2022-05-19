package me.hfox.iracing.sdk.spring.exception;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

public class SdkJsonProcessingException extends JsonProcessingException {

    public SdkJsonProcessingException(String msg, JsonLocation loc, Throwable rootCause) {
        super(msg, loc, rootCause);
    }

    public SdkJsonProcessingException(String msg) {
        super(msg);
    }

    public SdkJsonProcessingException(String msg, JsonLocation loc) {
        super(msg, loc);
    }

    public SdkJsonProcessingException(String msg, Throwable rootCause) {
        super(msg, rootCause);
    }

    public SdkJsonProcessingException(Throwable rootCause) {
        super(rootCause);
    }

}
