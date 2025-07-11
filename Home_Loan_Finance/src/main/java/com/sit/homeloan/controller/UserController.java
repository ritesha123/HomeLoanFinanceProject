package com.sit.homeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sit.homeloan.dto.LoginRequest;
import com.sit.homeloan.model.User;
import com.sit.homeloan.service.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public User login(@RequestBody LoginRequest loginRequest) {
	    String email = loginRequest.getEmail();
	    String password = loginRequest.getPassword();
	    return userService.login(email, password);
	}


}
