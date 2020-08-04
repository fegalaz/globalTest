package com.test.globallogic.dto;

import java.util.List;

public class UserDTO {
	private Integer id;
	private String name;
	private String email;
	private String password;
	List<PhoneDTO> phoneDTOs;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<PhoneDTO> getPhones() {
		return phoneDTOs;
	}
	public void setPhones(List<PhoneDTO> phoneDTOs) {
		this.phoneDTOs = phoneDTOs;
	}
	
	
}
