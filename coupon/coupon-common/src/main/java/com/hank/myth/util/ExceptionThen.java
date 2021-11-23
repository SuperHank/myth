package com.hank.myth.util;

import com.hank.myth.enums.common.ResultCode;
import com.hank.myth.exception.BusinessException;

public class ExceptionThen {
    public static void then(boolean condition, ResultCode resultCode, String msg) {
        if (condition) {
            throw new BusinessException(resultCode.getMessage(), msg, false);
        }
    }

    public static void then(boolean condition, String bizName, Throwable cause) {
        if (condition) {
            throw new BusinessException(cause, bizName);
        }
    }
}
