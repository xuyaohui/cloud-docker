package com.teradata.starter.controller;

import com.teradata.starter.bean.UserBean;
import com.teradata.starter.repository.UserService;
import com.teradata.starter.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyaohui
 * @date 2018/8/6 0006 上午 10:09
 */

@RestController
public class TestController {


    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "success";
    }


    @RequestMapping("/login")
    public String login(){
        return JWTUtil.sign("idaadmin", "dn1rjz8Hzuo=");
    }

    @GetMapping("/getUser")
    //@RequiresAuthentication
    public String testGetUser(){

        String userName= "idaadmin";
        UserBean userBean=userService.getUserByName(userName);
        return userBean.toString();
    }
}
