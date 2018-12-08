package com.ybtccc.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by ybtccc , 2018/11/25
 * SrvApplication
 */
@SpringBootApplication
public class SrvApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SrvApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
