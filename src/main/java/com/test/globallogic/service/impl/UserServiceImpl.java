package com.test.globallogic.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.globallogic.dto.Phone;
import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.model.Phones;
import com.test.globallogic.model.User;
import com.test.globallogic.repository.UserRepository;
import com.test.globallogic.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDTO createUser(UserDTO userResquest) {
		User newUser = new User();
		
		newUser.setEmail(userResquest.getEmail());
		newUser.setName(userResquest.getName());
		newUser.setPassword(userResquest.getPassword());
		List<Phone> listPhones = userResquest.getPhones();
		Set<Phones> newPhones = new HashSet<Phones>();
		listPhones.forEach(s -> {
			Phones phs = new Phones();
			phs.setNumber(s.getNumber());
			phs.setCityCode(s.getCityCode());
			phs.setCountryCode(s.getCountryCode());
			newPhones.add(phs);
			newUser.setPhones(newPhones);
		});
		User respond = userRepository.save(newUser);
		return null;
	}
}
 