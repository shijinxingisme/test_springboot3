package com.demo.test_sringboot3.vo.user;

import lombok.Data;

@Data
public class BaseVO<T> {
    private T data;
    private int statusCode;
    private String message;


    private BaseVO(){

    }
}
