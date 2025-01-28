package com.project.userdetails.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.project.userdetails.entity.User;

@Service
public class UserService {
	
	private final List<User> users = new ArrayList<>();
	
//	private static final List<User> users = Arrays.asList(
//			new User("john","john@demo.com","1234567890"),
//			new User("shan","shan@demo.com","2467195378"));
	
		
	//create user
	public String createUser(User newUser) {
		Optional<User> existingUser = users.stream()
				  					.filter(user->user.getUserName().equals(newUser.getUserName()))
				  					.findFirst();
		
		if(existingUser.isPresent()) {
			return "user already exists";
		}
		users.add(newUser);
		return "user created successfully";
		
		}
	
	//search user
	public User getUser(String userName) {
		return  users.stream()
				.filter(user->user.getUserName().equalsIgnoreCase(userName))
				.findFirst().orElse(new User());
					
	}
	
	//update user
	public String updateUser(String userName, User updateUser) {
		for(User user:users) {
			if(user.getUserName().equals(userName)) {
				user.setEmailId(updateUser.getEmailId());
				user.setPhoneNumber(updateUser.getPhoneNumber());
				return "user updated successfully";
			}
			}
		return "user not found";
		}
	
	//delete user
	public String deleteUser(String userName) {
		boolean removed = users.removeIf(user->user.getUserName().equals(userName));
		if(removed) {
			return "user deleted";
		}
		return "user not found";
	}
	
		
}
	
	

	


