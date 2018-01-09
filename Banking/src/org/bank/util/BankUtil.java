package org.bank.util;

import org.bank.model.Customer;
import org.bank.model.User;

public class BankUtil {
	
	public User createNewUser(Customer customer) {
		User user = new User();
		String userName = "";
		if(customer.getFirstName().length() > 3 && customer.getLastName().length() > 3)
			userName = customer.getFirstName().substring(0, 3).toLowerCase() + customer.getLastName().substring(0, 3).toLowerCase();
		user.setUserName(userName);
		
		String password = "NewPassword";
		user.setUserPassword(password);
		
		user.setUserType("USER");
		return user;
	}

}
