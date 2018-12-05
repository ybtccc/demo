package com.ybtccc.admin;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * AdminApplication Created by ybtccc. 2018/11/29
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class AdminApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminApplication.class).web(WebApplicationType.SERVLET).run(args);

    }
}
