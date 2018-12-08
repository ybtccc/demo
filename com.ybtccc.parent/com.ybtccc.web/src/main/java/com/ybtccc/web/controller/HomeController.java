package com.ybtccc.web.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ybtccc.api.service.EchoService;
import com.ybtccc.core.BizException;
import com.ybtccc.web.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by ybtccc , 2018/11/25
 * HomeController
 */
@RestController
public class HomeController {

    @Autowired
    private EchoService echoService;

    @RequestMapping("/")
//    @HystrixCommand(
//            fallbackMethod = "fallback",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
//            },
//            ignoreExceptions = {BizException.class})
    public Result index(){
        return Result.success(echoService.echo(UUID.randomUUID().toString()));
    }


    @RequestMapping("/act/user")
    public Result user(){
        return Result.success("Hello.User");
    }

    public Result fallback(){
        return Result.limit();
    }

}
