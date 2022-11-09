package com.ustc.fastlocker.server.util;

import com.ustc.fastlocker.server.global.ErrorCode;

public class Results {

    public static Result success(Object data) {
        return new Result(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMsg(), data);
    }

    public static Result fail(ErrorCode e, Object data) {
        return new Result(e.getCode(), e.getMsg(), data);
    }

    public static Result fail(int code, String msg, Object data) {
        return new Result(code, msg, data);
    }
}
