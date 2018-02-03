package org.bank.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.bank.dao.BankDao;
import org.bank.dao.IBankDao;
import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.BankTransaction;
import org.bank.model.User;
import org.bank.util.BankUtil;

public class BankServices implements IBankServices {
	
	private IBankDao dao = new BankDao();
	private BankUtil bankUtil = new BankUtil();
	
	@Override
	public User isValidUser(User user) {
		User user_detail = dao.getUserByUserNameAndPassword(user.getUserName(),user.getUserPassword());
		
		if(user_detail != null)
			return user_detail;
		
		return null;
	}

	@Override
	public void saveUser(User user) {

		user.setUserName("akash");
		user.setUserPassword("password");
		user.setUserType("ADMIN");
		dao.saveUser(user);
	}

	@Override
	public boolean registerNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		List<Account> accs = new ArrayList<>();
		Account acc = customer.getAccount();
		acc.setAccountNumber(ThreadLocalRandom.current().nextLong(1000,5000));
		acc.setBalance(0);
		accs.add(acc);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		customer.setCreatedTimestamp(currentTime);
		customer.setUpdateTimestamp(currentTime);
		
		User user = new User();
		user.setUserName(isNewUserName(customer));
		user.setUserPassword("newUser");
		user.setUserType("user");
		
		customer.setUser(user);
		
		customer.setAccounts(accs);
		boolean isSuccess = dao.saveCustomer(customer);
		return isSuccess;
	}

	@Override
	public Customer getCustomerByUser(User user) {
		// TODO Auto-generated method stub
		Customer customer_Details = dao.getCustomerByUser(user);
		
		if (customer_Details != null)
			return customer_Details;
		
		return null;
	}

	@Override
	public String isNewUserName(Customer customer) {
		// TODO Auto-generated method stub
		String newUserName = "";
		
		if(customer.getFirstName().length() > 3 && customer.getLastName().length() > 3)
		newUserName = customer.getFirstName().substring(0, 3).toLowerCase() + customer.getLastName().substring(0, 3).toLowerCase();
		 
		User newUser = dao.getNewUserName(newUserName);
		 if (newUser == null) {
			return newUserName;
		} else {
			customer.getUser().setUserName(newUserName + customer.getAadharcard().substring(0, 3));
			isNewUserName(customer);
		}
		
		return newUserName;
	}

	@Override
	public Account getAccountByCustomer(Customer customer) {
		// TODO Auto-generated method stub
	Account accountDetails = dao.getAccountByCustomer(customer);
		
	if(accountDetails != null)
			return accountDetails;
		
	return null;
	}

	@Override
	public boolean performtransaction(BankTransaction transactions) {
		// TODO Auto-generated method stub
		 
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("transaction");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		return isCompleteTransaction;
	}

	@Override
	public boolean performdthrecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("DTH recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public boolean performgasrecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("Gas recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public boolean performmobilerecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("Mobile recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public List<BankTransaction> getTrasactionByAccountNumber(String accountNumber) {
		List<BankTransaction> transaction = dao.getTrasactionByAccountNumber(accountNumber);
		return transaction;
	}
}
