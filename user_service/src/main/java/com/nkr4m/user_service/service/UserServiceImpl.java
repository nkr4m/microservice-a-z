package com.nkr4m.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nkr4m.user_service.entity.User;
import com.nkr4m.user_service.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	private StreamBridge streamBridge;


	@Override
	public User getUserDetails(Integer userId) {
		User user = userRepo.findByUserId(userId);
//		System.out.println(user);
		sendCommunication(user.getUserId());
		return user;
	}
	
	private void sendCommunication(Integer userId) {
//        var accountsMsgDto = new AccountsMsgDto(account.getAccountNumber(), customer.getName(),
//                customer.getEmail(), customer.getMobileNumber());
        log.info("Sending Communication request for the details: {}", userId);
        System.out.println(userId);
        var result = streamBridge.send("sendCommunication-out-0", userId);
        log.info("Is the Communication request successfully triggered ? : {}", result);
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
	
	public boolean updateCommunicationStatus(Integer accountNumber) {
		log.info("The user was sent notification : {}", accountNumber.toString());
		return true;
    }


}
