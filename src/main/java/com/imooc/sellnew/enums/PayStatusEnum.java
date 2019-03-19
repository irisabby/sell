package com.imooc.sellnew.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2019/2/27 11:59
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"成功支付"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
