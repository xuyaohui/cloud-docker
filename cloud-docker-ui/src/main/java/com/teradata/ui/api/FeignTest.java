package com.teradata.ui.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cloud-service2",fallback = FeignTestImpl.class)
public interface FeignTest {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
}
