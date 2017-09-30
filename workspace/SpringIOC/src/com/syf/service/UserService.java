package com.syf.service;

import com.syf.dao.UserDao;
import com.syf.model.User;

public class UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	public void add(User user) {
		userDao.add(user);
	}

}
