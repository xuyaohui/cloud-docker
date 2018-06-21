package com.teradata.service1.controller;

import com.teradata.common.util.RandomUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("hello1")
    public String hello1(){
        return RandomUtil.createComplexCode(10)+"Hello World! Service 1";
    }

    @Value("${foo}")
    String foo;

    @RequestMapping("hello")
    public String hello(){
        return RandomUtil.createComplexCode(10)+"Hello World! Service 1"+"config值为： "+foo;
    }
}
