package com.test.globallogic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.model.User;
import com.test.globallogic.repository.UserRepository;
import com.test.globallogic.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO createUser(UserDTO user) {
		User respond = userRepository.saveAndFlush(user);
		return null;
	}
}
