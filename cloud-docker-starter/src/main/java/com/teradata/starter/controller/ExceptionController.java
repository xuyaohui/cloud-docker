package com.teradata.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyaohui
 * @date 2018/8/6 0006 上午 10:40
 */

@RestController
public class ExceptionController {

    @GetMapping("/401")
    public String exception401(){
        return "请先登录！！！";

    }

    @GetMapping("/500")
    public String exception500(){
        return "系统内部错误";

    }
}
