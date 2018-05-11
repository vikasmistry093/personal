package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.AddressInfo;
import com.solane.model.Address;

@Component
@Transactional
public class AddressMapper {

	public static Address convertIntoAddress(AddressInfo addressInfo) {
		Address address = new Address();
		address.setAddressId(addressInfo.getAddressId());
		address.setCity(addressInfo.getCity());
		address.setCreatedTimestamp(addressInfo.getCreatedTimestamp());
		address.setLandMark(addressInfo.getLandMark());
		address.setPin(addressInfo.getPin());
		address.setState(addressInfo.getState());
		address.setStreet(addressInfo.getStreet());
		address.setUdatedTimeStamp(addressInfo.getUdatedTimeStamp());
		return address;
	}
	
	public static AddressInfo convertIntoAddressInfo(Address address) {
		AddressInfo addressInfo = new AddressInfo();
		addressInfo.setAddressId(address.getAddressId());
		addressInfo.setCity(address.getCity());
		addressInfo.setCreatedTimestamp(address.getCreatedTimestamp());
		addressInfo.setLandMark(address.getLandMark());
		addressInfo.setPin(address.getPin());
		addressInfo.setState(address.getState());
		addressInfo.setStreet(address.getStreet());
		addressInfo.setUdatedTimeStamp(address.getUdatedTimeStamp());
		return addressInfo;
	}

	public static List<Address> convertIntoAddressList(List<AddressInfo> userAddressInfoList) {
		return userAddressInfoList.stream()
				.map(AddressMapper::convertIntoAddress)
				.collect(Collectors.toList());
	}

	public static List<AddressInfo> convertIntoAddressInfoList(List<Address> userAddressList) {
		return userAddressList.stream()
				.map(AddressMapper::convertIntoAddressInfo)
				.collect(Collectors.toList());
	}

}
