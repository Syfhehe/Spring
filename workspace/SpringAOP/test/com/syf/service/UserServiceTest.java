package com.syf.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syf.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService svc = (UserService) applicationContext.getBean("userService");
		User u = new User();
		u.setId(1);
		u.setName("name");
		svc.add(u);
	}

}
