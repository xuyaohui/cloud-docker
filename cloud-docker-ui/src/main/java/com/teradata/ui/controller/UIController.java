package com.teradata.ui.controller;

import com.teradata.ui.api.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UIController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignTest feignTest;

    final String SERVICE_NAME="cloud-service1";
    final String SERVICE_NAME2="cloud-service2";

    @RequestMapping("index")
    public String index(){
        return restTemplate.getForObject("http://"+SERVICE_NAME+"/hello",String.class);
    }

    @RequestMapping("index1")
    public String index1(){
        return restTemplate.getForObject("http://"+SERVICE_NAME2+"/hello",String.class);
    }

    @RequestMapping("hello")
    public String hello(){
        return feignTest.hello();
    }
}
