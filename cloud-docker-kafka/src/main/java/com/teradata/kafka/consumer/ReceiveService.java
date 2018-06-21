package com.teradata.kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class ReceiveService {


    @StreamListener(Sink.INPUT)
    public void onReceive(byte[] msg) {
        System.out.println("get Kafka message:" + new String(msg));

    }
}
