package com.glacier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 测试负载均衡
 * @since 2025/6/13 11:23
 */
@SpringBootTest
public class LoadBalanceTest {

    /**
     * 测试负载均衡
     * LoadBalancerClient 支持版本为 : Spring Cloud 2022 及之前的版本
     * Spring Cloud 2023.x 开始，官方已不再提供该接口的默认实现
     * 手动增加依赖在pom.xml 中添加
     */

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Test
    public void testLoadBalance() {
        ServiceInstance choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost()+":"+choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost()+":"+choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost()+":"+choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost()+":"+choose.getPort());
    }
}
