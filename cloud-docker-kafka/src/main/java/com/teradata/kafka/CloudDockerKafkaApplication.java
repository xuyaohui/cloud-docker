package com.teradata.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class CloudDockerKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDockerKafkaApplication.class, args);
    }
}
