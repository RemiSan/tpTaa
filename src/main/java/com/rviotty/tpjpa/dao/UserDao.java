package com.rviotty.tpjpa.dao;

import com.rviotty.tpjpa.entities.User;

public class UserDao extends AbstractDao<Long, User> {

	public UserDao() {
		super(User.class);
	}

}
