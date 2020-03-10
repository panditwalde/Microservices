package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Springclient2Application {
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	
//	@Bean
//	public WebClient.Builder getWebClieBuilder(){
//		
//		return WebClient.builder();
//	}

	public static void main(String[] args) {
		SpringApplication.run(Springclient2Application.class, args);
	}

}
