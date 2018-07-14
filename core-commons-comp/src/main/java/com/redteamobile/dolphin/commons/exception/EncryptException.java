package com.redteamobile.dolphin.commons.exception;


import com.redteamobile.dolphin.commons.constant.ErrorCode;

public class EncryptException extends BaseException{

    public EncryptException() {

        super(ErrorCode.ENCRYPT_ERROR);
    }
}
