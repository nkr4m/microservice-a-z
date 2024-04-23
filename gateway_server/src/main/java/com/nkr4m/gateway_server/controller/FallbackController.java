package com.nkr4m.gateway_server.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FallbackController {
	
	@GetMapping("contactSupport")
	public ResponseEntity<String> getMethodName() {
		return new ResponseEntity<String>("Please try again later", HttpStatus.OK);
	}
	

}
