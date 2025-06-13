package com.glacier.controller;

import com.glacier.product.bean.Product;
import com.glacier.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 商品服务控制类
 * @since 2025/6/12 17:06
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * @apiNote 根据商品id查询商品信息
     */
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.getProduct(productId);
    }
}
