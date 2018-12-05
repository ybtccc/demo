package com.ybtccc.web;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Created by ybtccc , 2018/11/25
 * WebApplication
 */

@SpringBootApplication
@EnableFeignClients("com.ybtccc.api")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class WebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WebApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
