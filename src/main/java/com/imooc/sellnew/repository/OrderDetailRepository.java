package com.imooc.sellnew.repository;

import com.imooc.sellnew.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/2/28 17:05
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail>  findByOrderId(String orderId);

}
