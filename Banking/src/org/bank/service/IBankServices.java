package org.bank.service;

import java.util.List;

import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.BankTransaction;
import org.bank.model.User;

public interface IBankServices {

	User isValidUser(User user);

	void saveUser(User user);

	boolean registerNewCustomer(Customer customer);

	Customer getCustomerByUser(User user);

	String isNewUserName(Customer customer);

	Account getAccountByCustomer(Customer customer);

	boolean performtransaction(BankTransaction transactions);

	boolean performdthrecharge(BankTransaction transactions);

	boolean performgasrecharge(BankTransaction transactions);

	boolean performmobilerecharge(BankTransaction transaction);

	List<BankTransaction> getTrasactionByAccountNumber(String accountNumber);

}
