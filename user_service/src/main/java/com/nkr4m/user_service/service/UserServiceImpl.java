package com.nkr4m.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkr4m.user_service.entity.User;
import com.nkr4m.user_service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User getUserDetails(Integer userId) {
		User user = userRepo.findByUserId(userId);
//		System.out.println(user);
		return user;
	}

	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		userRepo.saveAndFlush(user);
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		userRepo.deleteUserId(userId);
		
	}

	@Override
	public User updateUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
