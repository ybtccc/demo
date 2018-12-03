package com.ybtccc.web.util;

/**
 * Result Created by ybtccc. 2018/12/3
 */
public class Result<T> {

    private String code = "00";
    private String msg = "";
    private T data = null;

    public static Result success(Object data){
        Result r = new Result();
        r.setData(data);
        return r;
    }

    public static Result success(){
        return new Result();
    }

    public static Result limit(){
        Result r = new Result();
        r.setCode(ErrorCode.RATE_LIMIT.code);
        r.setMsg(ErrorCode.RATE_LIMIT.msg);
        return r;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
