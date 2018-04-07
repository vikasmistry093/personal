package com.solane.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.UserDAO;
import com.solane.mapper.model.UserInfo;

@Component
public class UserMapper {
	
	@Autowired
	private UserDAO userDAO;

	public void saveOrUpdate(UserInfo user) {
		
	}

}
