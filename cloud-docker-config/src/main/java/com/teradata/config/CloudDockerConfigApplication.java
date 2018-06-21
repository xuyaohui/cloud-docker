package com.teradata.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 将配置文件保存到私有仓库
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CloudDockerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDockerConfigApplication.class, args);
    }
}
