package com.nkr4m.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nkr4m.user_service.client.BookFeignClient;
import com.nkr4m.user_service.entity.Books;
import com.nkr4m.user_service.entity.User;
import com.nkr4m.user_service.util.AppConfig;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserBookController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	BookFeignClient bookFeignClient;
	
//	using rest template
//	@GetMapping("/fetch-userWbook")
//	public ResponseEntity<User> fetchUserWbooks(){
//		Books book = restTemplate.getForObject("http://book-service/fetch-book?id=1", Books.class);
//		System.out.println(book);
//		return null;
//	}
	
	
//	using feign client
	@GetMapping("/fetch-userWbook")
	public ResponseEntity<Books> fetchUserWbooks(){
		ResponseEntity<Books> book = bookFeignClient.fetchUserBooks(1);
		
		return book;
	}
	
	
	

}
