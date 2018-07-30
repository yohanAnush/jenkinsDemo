package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
	
	@RequestMapping("greet")
	public ResponseEntity<String> greet() {
		return new ResponseEntity<>("Welcome!", HttpStatus.OK);
	}

}
