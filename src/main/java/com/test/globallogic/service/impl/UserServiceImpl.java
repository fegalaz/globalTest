package com.test.globallogic.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.globallogic.dto.PhoneDTO;
import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.model.Phones;
import com.test.globallogic.model.User;
import com.test.globallogic.repository.UserRepository;
import com.test.globallogic.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final static Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO createUser(UserDTO userResquest) {
				
		
		User newUser = new User();
		newUser.setEmail(userResquest.getEmail());
		newUser.setName(userResquest.getName());
		newUser.setPassword(userResquest.getPassword());
		newUser.setCreated(LocalDateTime.now());
		newUser.setLastLogin(LocalDateTime.now());
		newUser.setIsActive(1);
		List<PhoneDTO> listPhones = userResquest.getPhoneDTOs();
		Set<Phones> newPhones = new HashSet<Phones>();
		listPhones.forEach(s -> {
			Phones phs = new Phones();
			phs.setNumber(s.getNumber());
			phs.setCityCode(s.getCityCode());
			phs.setCountryCode(s.getCountryCode());
			newPhones.add(phs);
			newUser.setPhones(newPhones);
		});
		LOGGER.info("Metodo que crea el usuario en la BD {userRepository.save}");
		User rsp = userRepository.save(newUser);

		UserDTO userRespond = new UserDTO();
		userRespond.setId(rsp.getId());
		userRespond.setEmail(rsp.getEmail());
		userRespond.setName(rsp.getName());
		userRespond.setPassword(rsp.getPassword());
		userRespond.setLastLogin(rsp.getLastLogin());
		userRespond.setIsActive(rsp.getIsActive());
		userRespond.setCreated(rsp.getCreated());
		List<PhoneDTO> phrespond = new ArrayList<>();
		rsp.getPhones().forEach(s -> {
			PhoneDTO ph = new PhoneDTO();
			ph.setNumber(s.getNumber());
			ph.setCityCode(s.getCityCode());
			ph.setCountryCode(s.getCountryCode());
			phrespond.add(ph);
		});
		userRespond.setPhoneDTOs(phrespond);
		return userRespond;
	}
	
	public boolean existMail(String mail) {		
		return userRepository.findByEmail(mail);
	}
}