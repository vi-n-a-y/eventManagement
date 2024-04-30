package com.eventManagement.service.impl;

import org.springframework.stereotype.Service;

import com.eventManagement.entities.User;
import com.eventManagement.repository.UserRepository;
import com.eventManagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository =userRepository;
	}

	@Override
	public User saveUser(User user) {
		User user1=userRepository.save(user);
		
		return user1;
	
	}

}
