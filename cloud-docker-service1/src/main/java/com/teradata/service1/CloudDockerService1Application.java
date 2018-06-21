package com.teradata.service1;

import com.teradata.common.util.RandomUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudDockerService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudDockerService1Application.class, args);
	}


	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
}
