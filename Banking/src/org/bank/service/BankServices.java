package org.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.bank.dao.BankDao;
import org.bank.dao.IBankDao;
import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.User;

public class BankServices implements IBankServices {
	
	private IBankDao dao = new BankDao();
	
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
		accs.add(acc);
		
		customer.setAccounts(accs);
		boolean isSuccess = dao.saveCustomer(customer);
		return false;
	}
	

}
