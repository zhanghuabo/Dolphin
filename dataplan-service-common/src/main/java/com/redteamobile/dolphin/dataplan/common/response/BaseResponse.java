package com.redteamobile.dolphin.dataplan.common.response;

import com.redteamobile.dolphin.dataplan.common.constant.ResponseCode;

public class BaseResponse<T> {

    private String code;

    private boolean success;

    private String msg;

    private T obj = null;

    public static BaseResponse build() {
        return new BaseResponse();
    }

    public BaseResponse success(T obj) {
        return this.setCode(ResponseCode.OK).setSuccess(true).setObj(obj);
    }

    public BaseResponse fail() {
        return this.setCode(ResponseCode.OK).setSuccess(false);
    }

    public String getCode() {
        return code;
    }

    public BaseResponse<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public BaseResponse<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BaseResponse<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getObj() {
        return obj;
    }

    public BaseResponse<T> setObj(T obj) {
        this.obj = obj;
        return this;
    }
}