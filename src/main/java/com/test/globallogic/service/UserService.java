package com.test.globallogic.service;

import com.test.globallogic.dto.UserDTO;

public interface UserService {

	UserDTO createUser(UserDTO user);
	
	boolean existMail(String email);
}
