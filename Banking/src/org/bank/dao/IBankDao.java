package org.bank.dao;

import org.bank.model.User;

public interface IBankDao {

	User getUserByUserNameAndPassword(String userName, String userPassword);

	void saveUser(User user);

}
