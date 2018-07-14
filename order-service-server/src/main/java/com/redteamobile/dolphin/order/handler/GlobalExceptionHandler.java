package com.redteamobile.dolphin.order.handler;

import com.redteamobile.dolphin.commons.constant.ErrorCode;
import com.redteamobile.dolphin.commons.exception.BaseException;
import com.redteamobile.dolphin.commons.response.BaseResponse;
import com.redteamobile.dolphin.order.message.LocaleMessageSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    protected LocaleMessageSource localeMessageSource;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResponse handleArgNotValidException(HttpServletRequest request, MethodArgumentNotValidException e) {
        return BaseResponse.build().fail()
                    .setCode(ErrorCode.MISSING_FIELDS_IN_REQUEST)
                    .setMsg(localeMessageSource.getMessage(ErrorCode.MISSING_FIELDS_IN_REQUEST));
    }

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse handleBaseException(HttpServletRequest request, BaseException e) {
        return BaseResponse.build().fail()
                .setMsg(localeMessageSource.getMessage(e.getErrorCode()))
                .setCode(e.getErrorCode());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse handleUnexpectedException(HttpServletRequest request, Exception e) {
        log.error("Unexpected exception received {}!!", e.getMessage());
        return BaseResponse.build().fail()
                .setMsg(e.getMessage())
                .setCode(ErrorCode.UNKNOWN_ISSUE);
    }

}
