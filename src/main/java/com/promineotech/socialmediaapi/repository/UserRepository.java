package com.promineotech.socialmediaapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialmediaapi.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
}
