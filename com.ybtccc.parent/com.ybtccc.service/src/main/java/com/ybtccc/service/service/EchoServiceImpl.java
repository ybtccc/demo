package com.ybtccc.service.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ybtccc.api.service.EchoService;
import com.ybtccc.core.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ybtccc , 2018/11/25
 * EchoService
 */
@RestController
public class EchoServiceImpl implements EchoService {

    private static Logger logger = LoggerFactory.getLogger(EchoService.class);

    @Override
    @HystrixCommand(
            fallbackMethod = "fallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
            },
            ignoreExceptions = {BizException.class})
    public String echo(String msg) {
        logger.info("访问接口。。。 echo");
        if (Math.random() > 0.5) {
            throw new RuntimeException("测试hystrix");
        } else {
            return "Hello," + msg;
        }
    }

    public String fallback(String msg){
        return null;
    }

}
