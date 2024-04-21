package com.nkr4m.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nkr4m.user_service.entity.User;
import com.nkr4m.user_service.service.UserService;

import jakarta.validation.Valid;

@RestController
@Validated
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("user-detail")
	public ResponseEntity<User> getUserDetail(@RequestParam Integer userId) {
		User user = userService.getUserDetails(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("delete-user")
	public void deleteUser(@RequestParam Integer userId){
		userService.deleteUser(userId);
	}
	
	@PostMapping("add-user")
	public void addUser(@Valid @RequestBody User user) {
		//TODO: process POST request
		userService.addNewUser(user);
	}
	
	
	
	

}
