package com.redteamobile.dolphin.commons.exception;


import com.redteamobile.dolphin.commons.constant.ErrorCode;

public class DataPlanWithoutBundleException extends BaseException{
    public DataPlanWithoutBundleException() {
        super(ErrorCode.NO_VALID_ORDER);
    }
}
