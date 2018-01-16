package org.bank.dao;

import org.bank.model.Customer;
import org.bank.model.User;

public interface IBankDao {

	User getUserByUserNameAndPassword(String userName, String userPassword);

	void saveUser(User user);

	boolean saveCustomer(Customer customer);

	Customer getCustomerByUser(User user);

	User getUserName(String userName);

	User getNewUserName(String newUserName);


}
