package com.ybtccc.service.service;

import com.ybtccc.api.service.EchoService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ybtccc , 2018/11/25
 * EchoService
 */
@RestController
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "Hello,"+msg;
    }
}
