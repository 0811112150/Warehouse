package com.nyb.warehouse.common;

/**
 * Created by aa on 2016/12/9.
 */
public enum ErrorCode {
    SystemError(1,"系统错误");

    private int code;
    private String name;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    private ErrorCode(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
