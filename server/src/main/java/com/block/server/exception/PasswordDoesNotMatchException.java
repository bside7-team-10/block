package com.block.server.exception;

import org.springframework.http.HttpStatus;

public class PasswordDoesNotMatchException extends BaseException {

    public PasswordDoesNotMatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

}
