package com.glacier.service.impl;

import com.glacier.bean.Product;
import com.glacier.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 商品服务实现
 * @since 2025/6/12 17:27
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProduct(Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setProductName("大西瓜"+productId);
        product.setProductDesc("测试商品描述");
        product.setPrice(new BigDecimal(100));
        product.setStatus(1);
        product.setNumber(100);
        return product;
    }
}
