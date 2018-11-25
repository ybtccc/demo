package com.ybtccc.web.controller;

import com.ybtccc.api.service.EchoService;
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

    @RequestMapping("/index")
    public String index(){
        return echoService.echo(UUID.randomUUID().toString());
    }
}
