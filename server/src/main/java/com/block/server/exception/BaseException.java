package com.block.server.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException{

    public BaseException() {
        super();
    }

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(Throwable e) {
        super(e);
    }

    public BaseException(String errorMessge, Throwable e) {
        super(errorMessge, e);
    }

    public abstract HttpStatus getHttpStatus();
}