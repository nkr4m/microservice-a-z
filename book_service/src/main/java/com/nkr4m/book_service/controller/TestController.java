package com.nkr4m.book_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	 @Value("${build.info}")
	    private String buildVersion;
	
	@GetMapping("build-info")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>(buildVersion, HttpStatus.OK);
		
		
	}
	

}
