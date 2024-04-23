package com.nkr4m.user_service.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.nkr4m.user_service.entity.Books;

@Component
public class BookFallback implements BookFeignClient {
	
	@Override
    public ResponseEntity<Books> fetchUserBooks(Integer id) {
        return null;
    }

}
