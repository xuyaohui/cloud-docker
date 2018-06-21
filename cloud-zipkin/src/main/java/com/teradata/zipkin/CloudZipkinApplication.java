package com.teradata.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class CloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinApplication.class, args);
    }
}
