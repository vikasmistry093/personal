package com.solane.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.UserMapper;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.RecommendationInfo;
import com.solane.mapper.model.UserInfo;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public void updateRecommendationForUser(UserInfo user, ProductInfo productInfo) {
		if(user != null) {
			if(user.getUserId() != null) {
				RecommendationInfo recommendations = user.getRecommendation();
				if(recommendations == null)
					recommendations = new RecommendationInfo();
				
				ArrayList<ProductInfo> recommendProducts = new ArrayList<>();
				recommendProducts.add(productInfo);
				recommendations.setRecommendedProduct(recommendProducts);
				
				user.setRecommendation(recommendations);
				userMapper.saveOrUpdate(user);
			}
		}
		
	}

	public boolean validateLogedUser(UserInfo user) {
		boolean isvalid = userMapper.validateUser(user);
		return isvalid;
	}

	public void registerNewUser(UserInfo userinfo) {
		userMapper.saveOrUpdate(userinfo);
	}

	public UserInfo getUserByLoggedUser(UserInfo user) {
		UserInfo userInfo = userMapper.getUserByLoggedUser(user);
		return userInfo;
	}

}
