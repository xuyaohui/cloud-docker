package com.teradata.tag.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 下午 2:45
 */

@RestController
public class MqController {

    @Resource
    private AmqpTemplate rabbitTemplate;



    @RequestMapping("/direct")
    public String direct(String p) {
        rabbitTemplate.convertAndSend("hello1","test");
        return "success";
    }
}
