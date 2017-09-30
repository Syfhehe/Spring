package com.syf.dao.impl;

import com.syf.dao.UserDao;
import com.syf.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("add user!");
	}

}
