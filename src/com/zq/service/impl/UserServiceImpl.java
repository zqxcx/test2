package com.zq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zq.dao.IUserDao;
import com.zq.dao.User;
import com.zq.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	IUserDao userDao;
	public User selectByNameAndPassword(String name,String password){
		return userDao.selectByNameAndPassword(name, password);
	}

}
