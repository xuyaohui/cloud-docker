package com.teradata.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(Source.class)
public class SendService {

    @Autowired
    private Source source;

    public void sendMessage(String msg) {
        try {
            System.out.println("构建的message: "+MessageBuilder.withPayload(msg).build());
            source.output().send(MessageBuilder.withPayload(msg).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
