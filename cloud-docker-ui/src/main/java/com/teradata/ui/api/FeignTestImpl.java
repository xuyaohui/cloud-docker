package com.teradata.ui.api;

import org.springframework.stereotype.Component;

@Component
public class FeignTestImpl implements FeignTest {
    @Override
    public String hello() {
        return "服务暂时不可用...";
    }
}
