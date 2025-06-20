package com.glacier;

import com.glacier.feign.IpAddressFeignClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote OpenFeign调用三方接口
 * @since 2025/6/20 10:33
 */
@SpringBootTest
public class FeignRemoteOtherAPITest {

    @Autowired
    private IpAddressFeignClient ipAddressFeignClient;

    @Test
    void testGetIpAddress() {
        System.out.println(ipAddressFeignClient.getIpAddress());
    }


}
