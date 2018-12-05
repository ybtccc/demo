package com.ybtccc.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ybtccc , 2018/11/25
 * EchoService
 */
@FeignClient(value = "com.ybtccc.service")
public interface EchoService {

    @PostMapping("echo")
    String echo(@RequestParam("msg") String msg);
}