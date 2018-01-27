package org.bank.service;

import org.bank.model.Customer;
import org.bank.model.User;

public interface IBankServices {

	User isValidUser(User user);

	void saveUser(User user);

	boolean registerNewCustomer(Customer customer);

	Customer getCustomerByUser(User user);

	String isNewUserName(Customer customer);

}
