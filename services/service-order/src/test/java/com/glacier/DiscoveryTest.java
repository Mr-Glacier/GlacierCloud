package com.glacier;

import com.alibaba.cloud.nacos.discovery.NacosDiscoveryClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 服务发现测试
 * @since 2025/6/12 16:46
 */
@SpringBootTest
public class DiscoveryTest {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    NacosDiscoveryClient nacosDiscoveryClient;


    /**
     * 服务发现测试,使用更加底层的 DiscoveryClient
     */
    @Test
    public void discoveryClientTest() {
        for (String service : discoveryClient.getServices()) {
            System.out.println(service);
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                System.out.println(instance.getHost() + ":" + instance.getPort());
            }
        }

    }

    /**
     * 服务发现测试,使用 NacosDiscoveryClient
     */
    @Test
    public void discoveryNacosClientTest() {
        for (String service : nacosDiscoveryClient.getServices()) {
            System.out.println(service);
            for (ServiceInstance instance : nacosDiscoveryClient.getInstances(service)) {
                System.out.println(instance.getHost() + ":" + instance.getPort());
            }
        }
    }

}
