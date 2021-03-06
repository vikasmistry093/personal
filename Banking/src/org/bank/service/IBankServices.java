package org.bank.service;

import java.util.List;

import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.Loan;
import org.bank.model.BankTransaction;
import org.bank.model.User;

public interface IBankServices {

	User isValidUser(User user);

	void saveUser(User user);

	boolean registerNewCustomer(Customer customer);

	Customer getCustomerByUser(User user);

	String isNewUserName(Customer customer);

	 List<Account> getAccountByCustomer(Customer customer);

	boolean performtransaction(BankTransaction transactions);

	boolean performdthrecharge(BankTransaction transactions);

	boolean performelectrirecharge(BankTransaction transactions);

	boolean performmobilerecharge(BankTransaction transactions);

	List<BankTransaction> getTrasactionByAccountNumber(String accountNumber);

	boolean checkBalanceByAccount(BankTransaction transaction);

	User isValideOldUser(User user, User users);

	boolean isNewAccountCreated(Customer customer , Account account);

	boolean isAddressUpdated(User user, Customer customer);

	boolean isEmailUpdated(User user, Customer customers);

	boolean isMobileUpadated(User user, Customer customers);

	boolean isPasswordUpdated(User user, User users);

	boolean isRequestedForLoan(Customer customer, Loan loan);

	boolean isValidAccountNumber(BankTransaction transactions);

	boolean isUserValideToCreateAccount(Customer customer);

	User isPasswordRegained(User user);

	boolean isValidToApplyForLoan(Customer customer);

	Account getAccountByAccountNumber(long accountNumber);

	





}
