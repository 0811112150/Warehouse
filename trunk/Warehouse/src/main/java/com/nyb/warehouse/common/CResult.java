package com.nyb.warehouse.common;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by aa on 2016/12/9.
 */
public class CResult<T> {

    private int errorCode;

    private String message;

    private T Data;

    public CResult(T data) {
        this.setData(data);
        this.setErrorCode(0);
    }

    public CResult(T data, ErrorCode errorCode) {
        this.setData(data);
        this.setErrorCode(errorCode.ordinal());

    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

}
