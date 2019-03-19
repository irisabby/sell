package com.imooc.sellnew.converter;

import com.imooc.sellnew.dataobject.OrderMaster;
import com.imooc.sellnew.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/3/6 15:58
 */
public class OrderMaster2OrderDTOConverter{

    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO=new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
            return orderMasterList.stream().map(e->convert(e))
                    .collect(Collectors.toList());
    }
}
