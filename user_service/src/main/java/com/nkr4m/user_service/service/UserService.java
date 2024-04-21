package com.nkr4m.user_service.service;

import com.nkr4m.user_service.entity.User;

public interface UserService {
	
	User getUserDetails(Integer userId);
	
	User addNewUser(User user);
	
	void deleteUser(Integer userId);
	
	User updateUser();

}
