package com.test.globallogic.controller;

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

@Controller
@RequestMapping("/user")
public class ControllerUser {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	@ResponseBody
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) throws Exception {
		
		UserDTO respond = userService.createUser(user);
		return new ResponseEntity<UserDTO>(respond, HttpStatus.OK);
	}
}
