package com.imooc.sellnew.service;

import com.imooc.sellnew.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Administrator on 2019/2/19 18:13
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
