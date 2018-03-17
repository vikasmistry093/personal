package com.solane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.AdminUserMapper;
import com.solane.mapper.model.AdminUserInfo;

@Service
public class AdminUserService {
	
	@Autowired
	private AdminUserMapper adminUserMapper;

	public List<AdminUserInfo> getAdminUserByStatus(String free) {
		return adminUserMapper.getAdminUserInfoByStatus(free);
	}

}
