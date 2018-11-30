package com.ybtccc.core;

/**
 * BizException Created by ybtccc. 2018/11/30
 */
public class BizException extends Exception{

    private String code;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public BizException(String code) {
        this.code = code;
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public BizException(String message, String code) {
        super(message);
        this.code = code;
    }
}
