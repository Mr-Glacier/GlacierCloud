package com.glacier.service;

import com.glacier.bean.Product;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 商品服务接口
 * @since 2025/6/12 17:25
 */
public interface ProductService {

    /**
     * 根据商品ID查询商品信息
     * @param productId 商品ID
     * @return 商品信息
     */
    Product getProduct(Long productId);
}
