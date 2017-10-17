package com.syf.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syf.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService svc = (UserService) ctx.getBean("userService");
		svc.add(new User());
		
		ctx.destroy();
	}

}
