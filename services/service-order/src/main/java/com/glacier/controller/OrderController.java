package com.glacier.controller;


import com.glacier.order.bean.Order;
import com.glacier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 订单控制类
 * @since 2025/6/13 10:10
 */
@RefreshScope
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Value("${order.orderTimeout}")
    String orderTimeOut;

    @Value("${order.hello}")
    String hello;


    @GetMapping("/config")
    public String getConfig() {
        return "Spring Boot :" + orderTimeOut + hello;
    }


    @GetMapping("/order")
    public Order getOrder(@RequestParam("productId") Long productId, @RequestParam("userId") Long userId) {
        return orderService.createOrder(productId, userId);
    }
}
