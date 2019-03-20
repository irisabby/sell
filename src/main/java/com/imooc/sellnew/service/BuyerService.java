package com.imooc.sellnew.service;

import com.imooc.sellnew.dto.OrderDTO;

/**
 * Created by Administrator on 2019/3/20 14:03
 * 买家
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);


}
