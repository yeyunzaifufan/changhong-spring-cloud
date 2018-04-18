package com.ly.discoveryeurekajq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaJqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaJqApplication.class, args);
	}
}
