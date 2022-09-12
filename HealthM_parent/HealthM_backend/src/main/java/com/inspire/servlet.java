package com.inspire;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class servlet {
    @Reference
    private controller controller;
    @RequestMapping("/hello")
    public String test(){
        controller.test();
        return "成功";
    }
}
