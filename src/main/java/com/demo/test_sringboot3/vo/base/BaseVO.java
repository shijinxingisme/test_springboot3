package com.demo.test_sringboot3.vo.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseVO<T> implements Serializable {
    private T data;
    private int statusCode;
    private String message;

    public BaseVO(T data, int statusCode, String message) {
        this.data = data;
        this.statusCode = statusCode;
        this.message = message;
    }

    private BaseVO(IResCode iResCode) {
        this(null, iResCode.code(), iResCode.msg());
    }
    private BaseVO(IResCode iResCode,T d) {
        this(d, iResCode.code(), iResCode.msg());
    }



    public static <T> BaseVO<T> ok() {
        return new BaseVO(ResCode.SUCCESS);
    }

    public static <T> BaseVO<T> data(T d) {
        return new BaseVO(ResCode.SUCCESS,d);
    }

}
