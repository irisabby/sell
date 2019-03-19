package com.imooc.sellnew.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品状态
 * Created by Administrator on 2019/2/20 11:57
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架"),
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }
}
