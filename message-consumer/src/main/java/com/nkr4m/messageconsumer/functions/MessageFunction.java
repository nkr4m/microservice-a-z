package com.nkr4m.messageconsumer.functions;

import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MessageFunction {

    private static final Logger log = LoggerFactory.getLogger(MessageFunction.class);

    @Bean
    public Function<Integer,Integer> email() {
        return accountsMsgDto -> {
            log.info("Sending email with the details : " +  accountsMsgDto);
            System.out.println(accountsMsgDto);
            return accountsMsgDto;
        };
    }

    @Bean
    public Function<Integer,Integer> sms() {
        return accountsMsgDto -> {
            log.info("Sending sms with the details : " +  accountsMsgDto);
            return accountsMsgDto;
        };
    }

}
