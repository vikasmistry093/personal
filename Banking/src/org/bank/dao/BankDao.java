package org.bank.dao;

import java.util.List;

import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.User;
import org.bank.model.BankTransaction;
import org.bank.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@SuppressWarnings("unchecked")
public class BankDao implements IBankDao {
	
	private Transaction transaction;
	
	@Override
	public User getUserByUserNameAndPassword(String userName, String userPassword) {
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		User user = null;
		
		Query query = session.createQuery("from User where userName=:userName and userPassword=:userPassword");
		query.setString("userName", userName);
		query.setString("userPassword", userPassword);
		
		user = (User) query.uniqueResult();
		transaction.commit();
		
	//	HibernateUtil.shutdown();
		return user;
	}

	@Override
	public void saveUser(User user) {
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		session.save(user);
		
		transaction.commit();
	}

	@Override
	public boolean saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		session.save(customer);
		
		transaction.commit();
		return true;
	}

	@Override
	public Customer getCustomerByUser(User user) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Customer customerDetail = null;
		
		Query query = session.createQuery("from Customer where user=:user");
		query.setEntity("user", user);
		customerDetail = (Customer) query.uniqueResult();
		
		transaction.commit();
		
		return customerDetail;
	}

	@Override
	public User getUserName(String userName) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		User newUser = null;
		Query query = session.createQuery("from User where userName=:userName");
		query.setString("userName", userName);
		newUser = (User) query.uniqueResult();
		
		transaction.commit();
		
		return newUser;
	}

	@Override
	public User getNewUserName(String newUserName) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		User newUser = null;
		Query query = session.createQuery("from User where userName=:newUserName");
		query.setString("newUserName", newUserName);
			
		newUser = (User) query.uniqueResult();
		
		transaction.commit();
		
		
		return newUser;
	}

	@Override
	public List<Account> getAccountByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		List<Account> accountDetials;
		
		Query query = session.createQuery("from Account where customer=:customer");
		query.setEntity("customer", customer);
		accountDetials = (List<Account>) query.list();
		transaction.commit();
		return accountDetials;
	}

	@Override
	public Customer getCustomerByAccount(Account benificiaryAccount) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Customer customer = null ;
		
		Query query = session.createQuery("from customer where Account=:benificiaryAccount");
		query.setEntity("Account", benificiaryAccount);
		customer = (Customer) query.uniqueResult();
		transaction.commit();
		return customer;
	}


	
	
	@Override
	public Account getAccountByAccountNumber(long accountNumber) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Account accountByNumber = null;
		
		Query query = session.createQuery("from Account where accountNumber=:accountNumber");
		query.setLong("accountNumber", accountNumber);
		accountByNumber = (Account) query.uniqueResult();
		transaction.commit();
		return accountByNumber;
	}

	@Override
	public boolean isCompleteTransaction(BankTransaction transactions) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		session.save(transactions);
		transaction.commit();
		return true;
	}

	@Override
	public List<BankTransaction> getTrasactionByAccountNumber(String accountNumber) {
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		List<BankTransaction> transactionDetails = null;
		
		Query query = session.createQuery("from BankTransaction where account.accountNumber=:accountNumber");
		query.setLong("accountNumber", Long.parseLong(accountNumber));
		transactionDetails = query.list();
		transaction.commit();
		return transactionDetails;
	}

	@Override
	public boolean isValidAccountNumber(long nextLong) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		Account newAccountNUmber = null;
		Query query = session.createQuery("from Account where accountNumber=:accountNumber");
		query.setLong("accountNumber", nextLong);
		newAccountNUmber = (Account) query.uniqueResult();
		
		if(newAccountNUmber !=null) {
			transaction.commit();
			return true;
		}
		transaction.commit();
		return false;
	}

	@Override
	public User isValidForgottenUser(String userName, String forgetEmail) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
		User forgottenUser = null;
		Query query = session.createQuery("from User where userName=:userName and forgetEmail=:forgetEmail");
		query.setString("userName", userName);
		query.setString("forgetEmail", forgetEmail);
		
		forgottenUser = (User) query.uniqueResult();
		
		transaction.commit();
		
		return forgottenUser;
	}


}
