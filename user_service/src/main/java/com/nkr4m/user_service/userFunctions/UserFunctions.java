package com.nkr4m.user_service.userFunctions;

import org.springframework.context.annotation.Configuration;

import com.nkr4m.user_service.service.UserService;
import com.nkr4m.user_service.service.UserServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
@Configuration
public class UserFunctions {

    private static final Logger log = LoggerFactory.getLogger(UserFunctions.class);
    
    @Autowired
    UserServiceImpl service;

    @Bean
    public Consumer<Integer> updateCommunication() {
        return userId -> {
            log.info("Updating Communication status for the account number : " + userId);
            System.out.println(userId + "from user fn");
            service.updateCommunicationStatus(userId);
        };
    }

}