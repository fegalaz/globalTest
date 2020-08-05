package com.test.globallogic.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.test.globallogic.dto.PhoneDTO;
import com.test.globallogic.util.ValidateEmail;
import com.test.globallogic.util.ValidatePassword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.service.UserService;

import java.util.Collections;

public class ControllerUserTest {
	
	@Mock
    private UserService userService;

	@Mock
    private ValidateEmail validateEmail;

	@Mock
    private ValidatePassword validatePass;

	@InjectMocks
    private ControllerUser controllerUser;
	    
    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    void createUserOK() {

        UserDTO user = new UserDTO();
        PhoneDTO phone = new PhoneDTO();
        user.setName("Felipe Galaz");
        user.setEmail("asasasa@rodriguez.org");
        user.setPassword("Hunt12");
        phone.setNumber("1234567");
        phone.setCityCode("1");
        phone.setCountryCode("57");
        user.setPhoneDTOs(Collections.singletonList(phone));

        when(validateEmail.isValid(anyString())).thenReturn(Boolean.TRUE);

        when(validatePass.isValid(anyString())).thenReturn(Boolean.TRUE);

        when(userService.createUser(any())).thenReturn(user);

        ResponseEntity<?> result = controllerUser.createUser(user);

        assertThat(result.getBody()).isNotNull();
    }
}
