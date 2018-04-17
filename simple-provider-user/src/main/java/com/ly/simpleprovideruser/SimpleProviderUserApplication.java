package com.ly.simpleprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SimpleProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleProviderUserApplication.class, args);
	}
}
