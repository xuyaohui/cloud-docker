package com.teradata.service2.controller;

import com.teradata.service2.api.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignTest feignTest;

    @RequestMapping("hello")
    public String hello(){
        return "Hello World! Service 2 "+feignTest.hello();
    }
}
