package com.nkr4m.user_service.exception;


public class UserServiceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer code;
	String message;
	
	UserServiceException(Integer code, String message){
		this.code = code;
		this.message = message;
	}

}
