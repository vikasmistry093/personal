package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.UserDAO;
import com.solane.mapper.model.UserInfo;
import com.solane.model.User;

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
		user.setStatus(userInfo.getStatus());
		user.setCardDetails(CardMapper.convertIntoCardList(userInfo.getCardDetails()));
		user.setUserAddress(AddressMapper.convertIntoAddressList(userInfo.getUserAddress()));
		user.setRecommendation(RecommendationMapper.convertIntoRecommendation(userInfo.getRecommendation()));
		user.setOrders(OrderMapper.convertIntoOrderList(userInfo.getOrders()));
		user.setWishList(WishListMapper.convertIntoWishList(userInfo.getWishList()));
		user.setType(userInfo.getType());
		user.setCreatedTimestamp(userInfo.getCreatedTimestamp());
		user.setUpdatedTimestamp(userInfo.getUpdatedTimestamp());
		return user;
	}

	public static UserInfo convertIntoUserInfo(User user) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(user.getUserId());
		userInfo.setName(user.getName());
		userInfo.setContact(user.getContact());
		userInfo.setEmail(user.getEmail());
		userInfo.setPassword(user.getPassword());
		userInfo.setStatus(user.getStatus());
		userInfo.setCardDetails(CardMapper.convertIntoCardInfoList(user.getCardDetails()));
		userInfo.setUserAddress(AddressMapper.convertIntoAddressInfoList(user.getUserAddress()));
		userInfo.setRecommendation(RecommendationMapper.convertIntoRecommendationInfo(user.getRecommendation()));
		userInfo.setOrders(OrderMapper.convertIntoOrderInfoList(user.getOrders()));
		userInfo.setWishList(WishListMapper.convertIntoWishListInfo(user.getWishList()));
		userInfo.setType(user.getType());
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

}
