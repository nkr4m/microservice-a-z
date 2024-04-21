package com.nkr4m.user_service.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

	    private  String apiPath;


	    private HttpStatus errorCode;


	    private  String errorMessage;


	    private LocalDateTime errorTime;
	    
	    public ErrorResponse() {
			// TODO Auto-generated constructor stub
		}

		public ErrorResponse(String apiPath, HttpStatus errorCode, String errorMessage) {
			super();
			this.apiPath = apiPath;
			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
			this.errorTime = LocalDateTime.now();
		}
	    
	    
}
