package com.imooc.sellnew.exception;

import com.imooc.sellnew.enums.ResultEnum;

/**
 * Created by Administrator on 2019/3/4 20:21
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
