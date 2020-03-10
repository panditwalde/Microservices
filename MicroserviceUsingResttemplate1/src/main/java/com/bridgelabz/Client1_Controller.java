package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1_Controller {
	
	
	
	@GetMapping("/user")
	public List<String> userInfo(){
		
	

		ArrayList<String >al=new ArrayList<String>();
		al.add("pandit");
		al.add("sourabh");
		al.add("ajay");
		al.add("dhannoo");
		
		return al;
	}

}
