package com.syf.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.syf.dao.UserDao;
import com.syf.model.User;

@Component
public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource(name = "u")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(User user) {
		userDao.add(user);
	}

}
