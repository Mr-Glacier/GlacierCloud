package com.glacier.service.impl;

import com.glacier.bean.Order;
import com.glacier.service.OrderService;
import org.mockito.internal.matchers.Or;
import org.springframework.stereotype.Service;

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

    @Override
    public Order createOrder(Long productId, Long userId) {
        Order order = new Order();
        order.setId(11L);
        order.setUserId(userId);
        order.setNickName("测试用户");
        order.setAddress("测试地址");

        //TODO: 远程调用商品服务，获取商品信息

        return order;
    }
}
