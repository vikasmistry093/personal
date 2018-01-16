package org.bank.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.bank.dao.BankDao;
import org.bank.dao.IBankDao;
import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.User;
import org.bank.util.BankUtil;

public class BankServices implements IBankServices {
	
	private IBankDao dao = new BankDao();
	private BankUtil bankUtil = new BankUtil();
	
	@Override
	public boolean isValidUser(User user) {
		User user_detail = dao.getUserByUserNameAndPassword(user.getUserName(),user.getUserPassword());
		
		if(user_detail != null)
			return true;
		
		return false;
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
	
}
