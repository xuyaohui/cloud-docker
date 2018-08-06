package com.teradata.tag.mq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author xuyaohui
 * @date 2018/7/27 0027 下午 2:34
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello1");
    }

}
