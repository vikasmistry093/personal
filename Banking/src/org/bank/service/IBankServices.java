package org.bank.service;

import org.bank.model.User;

public interface IBankServices {

	boolean isValidUser(User user);

	void saveUser(User user);

}
