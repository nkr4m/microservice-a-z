package com.nkr4m.user_service.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Schema(
        name = "User",
        description = "Schema to hold user information"
)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	Integer userId;
	@Schema(
            description = "Name of the user", example = "abc ram"
    )
	@NotEmpty(message = "Name can not be a null or empty")
	@Size(min = 5, max = 30, message = "The length of the user's name should be between 5 and 30")
	String name;
	String email;
	String gender;
	String phoneNumber;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String name, String email, String gender, String phoneNumber) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	

}
