package com.logzc.langzic.exception;

/**
 * Created by lishuang on 2016/10/27.
 */
public class ZicException extends RuntimeException {

    public ZicException(String message) {
        super(message);
    }

    public ZicException(Exception e) {
        super(e);
    }
}
