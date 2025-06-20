package com.glacier.feign;

import com.glacier.product.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 远程调用商品接口
 * @since 2025/6/20 9:24
 */
@FeignClient(value = "service-product")
public interface ProductFeignClient {

    /**
     * MVC 的两套使用逻辑:
     * 1.标注在Controller中,是接收这样的请求
     * 2.标注在FeignClient上,是发送这样的请求
     */

    /**
     * 获取商品信息
     * @param id 商品id
     * @return 商品信息
     */
    @GetMapping("/product/{id}")
    Product getProductInfo(@PathVariable("id") Long id);

}
