package com.test.globallogic.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.service.UserService;

public class ControllerUserTest {
	
	@Mock
    private UserService userService;
	
	@InjectMocks
    private ControllerUser controllerUser;
	    
    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createUser() {

    	UserDTO user = new UserDTO();
    	user.setName("Felipe Galaz");
    	user.setEmail("fe.galaz@gmail.com");
    	user.setPassword("Hunt12");
    	
        when(userService.createUser(any())).thenReturn(user);

        ResponseEntity<?> result = controllerUser.createUser(user);

        assertThat(result.getBody()).isNotNull();
    }
}
