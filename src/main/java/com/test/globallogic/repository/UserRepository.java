package com.test.globallogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.globallogic.dto.UserDTO;
import com.test.globallogic.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User save(UserDTO user);
}
