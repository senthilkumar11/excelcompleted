package com.premium.stc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.premium.stc.model.User;

public interface UserDao extends JpaRepository<User, Integer>{
	 
	 
}
