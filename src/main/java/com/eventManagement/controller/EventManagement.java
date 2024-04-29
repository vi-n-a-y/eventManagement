package com.eventManagement.controller;


import org.springframework.stereotype.Controller;

import com.eventManagement.entities.User;


@Controller
public class EventManagement {

	private User user;
	
	public EventManagement(User user){
		super();
		this.user=user;
	}
	
	
	
}