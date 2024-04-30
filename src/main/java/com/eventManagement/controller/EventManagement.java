package com.eventManagement.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventManagement.entities.User;
import com.eventManagement.service.UserService;


@RestController
@RequestMapping("/event")
public class EventManagement {
	

private UserService userService;
public EventManagement(UserService userService) {
	super();
	this.userService=userService;
}

@PostMapping("/save")
public ResponseEntity<User> insertUser(@RequestBody User user){
	
	return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	
	
	
}

	

	
}