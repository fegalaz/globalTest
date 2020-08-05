package com.test.globallogic.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.service.UserService;
import com.test.globallogic.util.ValidateEmail;
import com.test.globallogic.util.ValidatePassword;

@Controller
@RequestMapping("/user")
public class ControllerUser {
	
	private final static Logger LOGGER = Logger.getLogger(Controller.class.getName());
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ValidateEmail validateMail;
	
	@Autowired
	private ValidatePassword validatePass;
	
	@PostMapping("/create")
	@ResponseBody
	public ResponseEntity<?> createUser(@RequestBody UserDTO user) {
		
		/*Valida Email*/
		if(validateMail.isValid(user.getEmail())){
			LOGGER.info("Email validated correctly");
		}else {
			LOGGER.info("Error parametro email");
			return new ResponseEntity<String>("Correo Erroneo : Ejemplo (aaaaaaa@dominio.cl)",HttpStatus.BAD_REQUEST);
		}
		/*Valida Password*/
		if(validatePass.isValid(user.getPassword())){
			LOGGER.info("Password validated correctly");
		}else {
			LOGGER.info("Error parametro password");
			return new ResponseEntity<String>("Debe contener al menos una mayuscula, letras minusculas, y dos numeros",HttpStatus.BAD_REQUEST);
		}
		
		LOGGER.info("{userService.createUser}");
		UserDTO respond = userService.createUser(user);
		return new ResponseEntity<UserDTO>(respond, HttpStatus.OK);
	}
	
}
