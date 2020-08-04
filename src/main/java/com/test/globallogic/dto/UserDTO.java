package com.test.globallogic.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The phone DTOs. */
	List<PhoneDTO> phoneDTOs;
}
