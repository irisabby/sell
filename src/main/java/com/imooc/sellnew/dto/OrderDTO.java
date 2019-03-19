package com.imooc.sellnew.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sellnew.dataobject.OrderDetail;
import com.imooc.sellnew.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/3/4 17:46
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** 订单id */
    private String orderId;

    /** 买家名字*/
    private String buyerName;

    /** 买家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信openid*/
    private String buyerOpenid;

    /** 订单总金额*/
    private BigDecimal orderAmount;

    /** 订单状态,默认为0 新下单 */
    private Integer orderStatus;

    /** 支付状态,默认为0 未支付*/
    private Integer payStatus;

    /**创建时间*/
    @JsonSerialize(using= Date2LongSerializer.class)
    private Date createTime;

    /**更新时间*/
    @JsonSerialize(using= Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail>  orderDetailList;

}
