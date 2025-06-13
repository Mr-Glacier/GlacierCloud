package com.glacier.service.impl;

import com.glacier.order.bean.Order;
import com.glacier.product.bean.Product;
import com.glacier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 订单实现类
 * @since 2025/6/13 10:18
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order createOrder(Long productId, Long userId) {
        Order order = new Order();
        order.setId(11L);
        order.setUserId(userId);
        order.setNickName("测试用户");
        order.setAddress("测试地址");

        //TODO: 远程调用商品服务，获取商品信息
        Product product = getProductFromRemote(productId);

        BigDecimal totalPrice = product.getPrice().multiply(new BigDecimal(product.getNumber()));
        order.setTotalPrice(totalPrice);
        order.setProductList(List.of(product));


        return order;
    }

    private Product getProductFromRemote(Long productId) {
        // 1. 获取商品服务所在IP地址以及相关端口
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        ServiceInstance instance = instances.get(0);
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/product/" + productId;
        // 2. 调用商品服务，获取商品信息
        return restTemplate.getForObject(url, Product.class);
    }
}
