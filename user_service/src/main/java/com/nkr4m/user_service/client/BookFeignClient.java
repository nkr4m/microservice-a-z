package com.nkr4m.user_service.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nkr4m.user_service.entity.Books;

@FeignClient("BOOK-SERVICE")
@LoadBalancerClient
public interface BookFeignClient {
	  @GetMapping(value = "fetch-book",consumes = "application/json")
	  public ResponseEntity<Books> fetchUserBooks(@RequestParam Integer id);

}
