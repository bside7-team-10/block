package com.block.server.exception;

import org.springframework.http.HttpStatus;

public class NotLoggedInException extends BaseException {

    public NotLoggedInException() {
        super("로그인 정보가 없습니다.");
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

}
