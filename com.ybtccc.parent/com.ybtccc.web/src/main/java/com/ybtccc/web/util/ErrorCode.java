package com.ybtccc.web.util;

/**
 * ErrorCode Created by ybtccc. 2018/12/3
 */
public enum  ErrorCode {
    RATE_LIMIT("1000","断路器保护")

    ;

    String code;
    String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
