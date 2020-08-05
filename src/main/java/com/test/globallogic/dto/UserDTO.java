package com.test.globallogic.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class UserDTO {
	
	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The created. */
	private LocalDateTime created;
	
	/** The last login. */
	private LocalDateTime lastLogin;
	
	private Integer isActive;
	
	/** The phone DTOs. */
	List<PhoneDTO> phoneDTOs;
}
