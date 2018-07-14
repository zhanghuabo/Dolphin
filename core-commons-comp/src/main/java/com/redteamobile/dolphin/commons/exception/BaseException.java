package com.redteamobile.dolphin.commons.exception;

public class BaseException extends Exception {

    private static final long serialVersionUID = 1831611793249206868L;

    private String errorCode;

    public BaseException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
