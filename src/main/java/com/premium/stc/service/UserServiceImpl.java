package com.premium.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premium.stc.dao.*;
import com.premium.stc.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User registerUser(User user) throws Exception {
		
		return userDao.save(user);

	}

	
	public User updateUser(User user) throws Exception {
		return userDao.save(user);
	
	}


	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	

}
