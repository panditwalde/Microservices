package com.bridgelabz;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Client2_controller {
	
	
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient.Builder WebClientBulilder;
	
	
	@GetMapping("/user")
	public List<Object> userInfo(){
		
		ObjectMapper m = new ObjectMapper();

		String url="http://localhost:8085/user";
		Object[] obj=restTemplate.getForObject(url, Object[].class);
		
//		Object[] obj= WebClientBulilder.build()
//		.get() 
//		.uri("http://localhost:8085/user")
//		.retrieve().bodyToMono(Object[].class).block();
		
		
		return Arrays.asList(obj);
		
		
	}
	
}
