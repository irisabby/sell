package com.imooc.sellnew.VO;

import lombok.Data;

/**
 * Created by Administrator on 2019/2/25 11:14
 * http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {
    /**错误码.*/
    private Integer code;

    /**提示信息.*/
    private String msg;

    /**具体内容*/
    private T data;

}
