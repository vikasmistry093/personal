package com.solane.mapper;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.WishListInfo;
import com.solane.model.WishList;

@Component
@Transactional
public class WishListMapper {
	
	public static WishList convertIntoWishList(WishListInfo wishListInfo) {
		WishList wishList = new WishList();
		wishList.setWishListId(wishListInfo.getWishListId());
		wishList.setProducts(ProductMapper.convertIntoProductList(wishListInfo.getProducts()));
		return wishList;
	}
	
	public static WishListInfo convertIntoWishListInfo(WishList wishList) {
		WishListInfo wishListInfo = new WishListInfo();
		wishListInfo.setWishListId(wishList.getWishListId());
		wishListInfo.setProducts(new LinkedHashSet<>(ProductMapper.convertIntoProductInfoList(wishList.getProducts())));
		return wishListInfo;
	}
	
	public static List<WishList> convertIntoPaymentList(List<WishListInfo> wishListInfoList) {
		return wishListInfoList.stream()
				.map(WishListMapper::convertIntoWishList)
				.collect(Collectors.toList());
	}
	
	public static List<WishListInfo> convertIntoPaymentInfoList(List<WishList> wishListList) {
		return wishListList.stream()
				.map(WishListMapper::convertIntoWishListInfo)
				.collect(Collectors.toList());
	}

}
