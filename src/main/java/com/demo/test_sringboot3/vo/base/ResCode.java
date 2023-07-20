package com.demo.test_sringboot3.vo.base;

public enum ResCode implements IResCode {
    SUCCESS(200, "成功"),
    FILE(201, "失败"),
    ERROR(203, "系统错误");

    final int code;
    final String msg;

    private ResCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int code() {
        return this.code;
    }

    @Override
    public String msg() {
        return this.msg;
    }
}
