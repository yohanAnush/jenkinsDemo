package com.example.demo.controller; 

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
	
	@RequestMapping("greet")
	public ResponseEntity<String> greet() {
		return new ResponseEntity<>("Welcome to Spring Boot on Jenkins", HttpStatus.OK);
	}


	@RequestMapping("user")
	public ResponseEntity<String> greetSpecificUser(@RequestParam Map<String, String> reqParams) {
		
		String user = "user";
		
		// greet user by his/her name if name is present in url, else opt to default greeting.
		if (reqParams.containsKey("user")) {
			user = reqParams.get("user");
		}
		
		return new ResponseEntity<>("Hello, " + user + "! This is running on an EC2 instance", HttpStatus.OK);
    }
}
