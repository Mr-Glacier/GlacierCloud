package com.glacier.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Mr-Glacier
 * @version 1.0
 * @apiNote 三方API
 * @since 2025/6/20 10:35
 */
@FeignClient(value = "ip-client", url = "https://newsapi.yiche.com")
public interface IpAddressFeignClient {

    /**
     * 获取ip地址
     * @return ip地址
     */
    @GetMapping("/citybase/position")
    String getIpAddress();
}
