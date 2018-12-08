package com.ybtccc.gateway.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HomeController Created by ybtccc. 2018/12/8
 */
@ControllerAdvice
public class HomeController implements ErrorController {

    public static final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping("/error")
    @ResponseBody
    public String error(){
        return "system is over";
    }
}
