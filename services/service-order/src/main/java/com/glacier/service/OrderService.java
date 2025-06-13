package com.glacier.service;

import com.glacier.order.bean.Order;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 订单服务接口
 * @since 2025/6/13 10:17
 */
public interface OrderService {

    /**
     * 创建订单
     * @param productId 商品ID
     * @param userId 用户ID
     * @return 订单信息
     */
    Order createOrder(Long productId, Long userId);

}
