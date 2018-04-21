package org.bank.dao;

import java.util.List;

import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.RateOfInterest;
import org.bank.model.BankTransaction;
import org.bank.model.User;

public interface IBankDao {

	User getUserByUserNameAndPassword(String userName, String userPassword);

	void saveUser(User user);

	boolean saveCustomer(Customer customer);

	Customer getCustomerByUser(User user);

	User getUserName(String userName);

	User getNewUserName(String newUserName);

	List<Account> getAccountByCustomer(Customer customer);

	Account getAccountByAccountNumber(long accountNumber);

	boolean isCompleteTransaction(BankTransaction transactions);

	List<BankTransaction> getTrasactionByAccountNumber(String accountNumber);

	boolean isValidAccountNumber(long nextLong);

	String getCustomerByAccount(Account account);

	User isValidForgottenUser(String userName, String forgetEmail);

	Customer getCustomerByAccountNumber(long accountNumber);

	RateOfInterest getRateofInterestByType(String accountType);

	

	


}
