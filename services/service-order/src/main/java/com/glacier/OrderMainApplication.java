package com.glacier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 订单服务启动类
 * @since 2025/6/12 15:02
 */
@EnableFeignClients  // 开启openfeign 服务调用功能
@SpringBootApplication
@EnableDiscoveryClient //开启服务发现
public class OrderMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}
