package com.teradata.tag.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 下午 2:42
 */

@Component
public class ReceiverMq {

    private static final Logger log = LoggerFactory.getLogger(ReceiverMq.class);


    @RabbitListener(queues = {"hello1"})
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);

    }

    /**
     * DIRECT模式.
     *
     * @param message the message
     * @param channel the channel
     * @throws IOException the io exception  这里异常需要处理
     */
    @RabbitListener(queues = {"DIRECT_QUEUE"})
    public void message(Message message, Channel channel) throws IOException {
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
        log.debug("DIRECT "+new String (message.getBody()));
    }
}