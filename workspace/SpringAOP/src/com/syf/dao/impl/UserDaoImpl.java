package com.syf.dao.impl;

import org.springframework.stereotype.Component;

import com.syf.dao.UserDao;
import com.syf.model.User;

@Component("u")
public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("add user!");
	}

}