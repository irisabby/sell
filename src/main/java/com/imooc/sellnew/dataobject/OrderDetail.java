package com.imooc.sellnew.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/2/27 13:52
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id*/
    private String orderId;

    /** 商品id*/
    private String productId;

    /** 商品名称*/
    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;

}
