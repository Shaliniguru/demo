package com.project.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.userdetails.entity.User;
import com.project.userdetails.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	UserService userService;	
	
	//create user API
	@PostMapping
    public String createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }
	
	//search user API
	@GetMapping("/{userName}")
	public User getUser(@PathVariable String userName) {
		return userService.getUser(userName);
	}
	
	//update user API
	@PutMapping("/{userName}")
	public String updateUser(@PathVariable String userName,@RequestBody User updatedUser) {
		return userService.updateUser(userName, updatedUser);
	}
	
	//delete user API
	@DeleteMapping("/{userName}")
    public String deleteUser(@PathVariable String userName) {
		return userService.deleteUser(userName);
	}

}
