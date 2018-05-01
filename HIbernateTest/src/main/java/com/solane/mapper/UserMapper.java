package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.UserDAO;
import com.solane.mapper.model.UserInfo;
import com.solane.model.User;
import com.solane.util.SolaneUtils;

@Component
public class UserMapper {
	
	@Autowired
	private UserDAO userDAO;
	
	public static User convertIntoUser(UserInfo userInfo) {
		User user = new User();
		user.setUserId(userInfo.getUserId());
		user.setName(userInfo.getName());
		user.setContact(userInfo.getContact());
		user.setEmail(userInfo.getEmail());
		user.setPassword(userInfo.getPassword());
		user.setStatus(userInfo.getStatus() != null ? userInfo.getStatus() : null);
		user.setCardDetails(userInfo.getCardDetails() != null ? CardMapper.convertIntoCardList(userInfo.getCardDetails()) : null);
		user.setUserAddress(userInfo.getUserAddress() != null ? AddressMapper.convertIntoAddressList(userInfo.getUserAddress()) : null);
		user.setRecommendation(userInfo.getRecommendation() != null ? RecommendationMapper.convertIntoRecommendation(userInfo.getRecommendation()) : null);
		user.setOrders(userInfo.getOrders() != null ? OrderMapper.convertIntoOrderList(userInfo.getOrders()) : null);
		user.setWishList(userInfo.getWishList() !=null ? WishListMapper.convertIntoWishList(userInfo.getWishList()) : null);
		user.setType(userInfo.getType() != null ? userInfo.getType() : null);
		user.setCreatedTimestamp(userInfo.getCreatedTimestamp() != null ? userInfo.getCreatedTimestamp() : SolaneUtils.getCurrentTimeStamp());
		user.setUpdatedTimestamp(userInfo.getUpdatedTimestamp() != null ? userInfo.getUpdatedTimestamp() : SolaneUtils.getCurrentTimeStamp());
		return user;
	}

	public static UserInfo convertIntoUserInfo(User user) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(user.getUserId());
		userInfo.setName(user.getName());
		userInfo.setContact(user.getContact());
		userInfo.setEmail(user.getEmail());
		userInfo.setPassword(user.getPassword());
		userInfo.setStatus(user.getStatus() != null ? user.getStatus() : null);
		userInfo.setCardDetails(user.getCardDetails() != null ? CardMapper.convertIntoCardInfoList(user.getCardDetails()) : null);
		userInfo.setUserAddress(user.getUserAddress() != null ? AddressMapper.convertIntoAddressInfoList(user.getUserAddress()) : null);
		userInfo.setRecommendation(user.getRecommendation() != null ? RecommendationMapper.convertIntoRecommendationInfo(user.getRecommendation()) : null);
		userInfo.setOrders(user.getOrders() != null ? OrderMapper.convertIntoOrderInfoList(user.getOrders()) : null);
		userInfo.setWishList(user.getWishList() != null ? WishListMapper.convertIntoWishListInfo(user.getWishList()) : null);
		userInfo.setType(user.getType() != null ? user.getType() : null);
		userInfo.setCreatedTimestamp(user.getCreatedTimestamp());
		userInfo.setUpdatedTimestamp(user.getUpdatedTimestamp());
		return userInfo;
	}
	
	public static List<User> convertIntoUserList(List<UserInfo> userInfoList) {
		return userInfoList.stream()
				.map(UserMapper::convertIntoUser)
				.collect(Collectors.toList());
	}
	
	public static List<UserInfo> convertIntoUserInfoList(List<User> userList) {
		return userList.stream()
				.map(UserMapper::convertIntoUserInfo)
				.collect(Collectors.toList());
	}
	
	public void saveOrUpdate(UserInfo user) {
		userDAO.saveOrUpdate(convertIntoUser(user));
	}

	public boolean validateUser(UserInfo user) {
		boolean isValid = userDAO.validateUserByEmailandPassword(user.getEmail(), user.getPassword());
		return isValid;
	}

	public UserInfo getUserByLoggedUser(UserInfo userInfo) {
		User user = userDAO.getUserByEmailandPassword(userInfo.getEmail(), userInfo.getPassword());
		UserInfo userInfos = convertIntoUserInfo(user);
		return userInfos;
	}

}
