package com.example.hw29;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CheckingForExceptions extends RuntimeException {
    public CheckingForExceptions() {
    }
    public CheckingForExceptions(String message) {
        super(message);
    }
    public CheckingForExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    public CheckingForExceptions(Throwable cause) {
        super(cause);
    }
    public CheckingForExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
