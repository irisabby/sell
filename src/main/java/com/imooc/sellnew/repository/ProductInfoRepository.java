package com.imooc.sellnew.repository;

import com.imooc.sellnew.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/2/20 10:27
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo>  findByProductStatus(Integer productStatus);



}
