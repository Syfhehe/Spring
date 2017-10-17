package com.syf.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.syf.dao.UserDao;
import com.syf.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Resource(name = "myDataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void add(User user) {
		try {
			Connection conn = dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null, 'Zhangsan')");
			conn.close();
			System.out.println("add user!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
