package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.AdminUserDAO;
import com.solane.mapper.model.AdminUserInfo;
import com.solane.model.AdminUser;

@Component
public class AdminUserMapper {
	
	@Autowired
	private AdminUserDAO adminUserDAO;
	
	public static AdminUserInfo convertIntoAdminUserInfo(AdminUser adminUser) {
		AdminUserInfo adminUserInfo = new AdminUserInfo();
		adminUserInfo.setUserId(adminUser.getUserId());
		adminUserInfo.setType(adminUser.getType());
		adminUserInfo.setContact(adminUser.getContact());
		adminUserInfo.setName(adminUser.getName());
		adminUserInfo.setEmail(adminUser.getEmail());
		adminUserInfo.setPassword(adminUser.getPassword());
		adminUserInfo.setCreatedTimestamp(adminUser.getCreatedTimestamp());
		adminUserInfo.setUpdatedTimestamp(adminUser.getUpdatedTimestamp());
		return adminUserInfo;
	}
	
	public static List<AdminUserInfo> convertIntoAdminUserInfoList(List<AdminUser> adminUsers) {
		return adminUsers.stream()
				.map(AdminUserMapper::convertIntoAdminUserInfo)
				.collect(Collectors.toList());
	}
	
	public static AdminUser convertIntoAdminUser(AdminUserInfo adminUserInfo) {
		AdminUser adminUser = new AdminUser();
		adminUser.setUserId(adminUserInfo.getUserId());
		adminUser.setType(adminUserInfo.getType());
		adminUser.setContact(adminUserInfo.getContact());
		adminUser.setName(adminUserInfo.getName());
		adminUser.setEmail(adminUserInfo.getEmail());
		adminUser.setPassword(adminUserInfo.getPassword());
		adminUser.setCreatedTimestamp(adminUserInfo.getCreatedTimestamp());
		adminUser.setUpdatedTimestamp(adminUserInfo.getUpdatedTimestamp());
		return adminUser;
	}
	
	public static List<AdminUser> convertIntoAdminUserList(List<AdminUserInfo> adminUserInfos) {
		return adminUserInfos.stream()
				.map(AdminUserMapper::convertIntoAdminUser)
				.collect(Collectors.toList());
	}

	public List<AdminUserInfo> getAdminUserInfoByStatus(String free) {
		List<AdminUser> adminUsers = adminUserDAO.getAdminUserInfoByStatus(free);
		return convertIntoAdminUserInfoList(adminUsers);
	}

	public AdminUserInfo getAdminUserInfoById(String adminUserId) {
		AdminUser user = adminUserDAO.getAdminUserInfoById(adminUserId);
		return convertIntoAdminUserInfo(user);
	}

	public void saveorUpdate(AdminUserInfo userInfo) {
		adminUserDAO.saveorUpdate(convertIntoAdminUser(userInfo));
	}

}
