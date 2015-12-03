package com.zq.service;

import com.zq.dao.User;

public interface UserService{

	public User selectByNameAndPassword(String name,String password);
	
}
