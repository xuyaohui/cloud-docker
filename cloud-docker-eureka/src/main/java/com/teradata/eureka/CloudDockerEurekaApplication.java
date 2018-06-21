package com.teradata.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudDockerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDockerEurekaApplication.class, args);
	}
}
