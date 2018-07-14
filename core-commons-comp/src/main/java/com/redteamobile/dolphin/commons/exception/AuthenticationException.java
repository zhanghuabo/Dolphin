package com.redteamobile.dolphin.commons.exception;


import com.redteamobile.dolphin.commons.constant.ErrorCode;

public class AuthenticationException extends BaseException {

    public AuthenticationException() {
        super(ErrorCode.NO_REAL_NAME_AUTHENTICATION);
    }
}
