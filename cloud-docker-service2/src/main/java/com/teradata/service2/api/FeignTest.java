package com.teradata.service2.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "config-client",fallback = FeignTestImpl.class)
public interface FeignTest {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
}
