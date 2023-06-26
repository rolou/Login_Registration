package com.rvalencia.loginregistration.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rvalencia.loginregistration.models.User;

public interface UserRepo extends CrudRepository<User, Long>{

	
	User findByEmail(String email);
}