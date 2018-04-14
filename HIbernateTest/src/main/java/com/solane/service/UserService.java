package com.solane.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.UserMapper;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.RecommendationInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.model.User;

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

	public boolean validateLoogedUser(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

}
