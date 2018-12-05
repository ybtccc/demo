package com.ybtccc.service.service;

import com.ybtccc.api.service.EchoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * EchoServiceImpl Created by ybtccc. 2018/12/5
 */
@RestController
public class EchoServiceImpl implements EchoService {

    private static Logger logger = LoggerFactory.getLogger(EchoService.class);

    @Override
    public String echo(String msg) {
        logger.info("访问接口。。。 echo");
        if (Math.random() > 0.5) {
            throw new RuntimeException("测试hystrix");
        } else {
            return "Hello," + msg;
        }
    }
}
