package org.bank.dao;

import org.bank.model.Customer;
import org.bank.model.User;
import org.bank.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BankDao implements IBankDao {
	
	private static Transaction transaction;
	
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
		
		Query query = session.createQuery("from User where user=:user");
		query.setEntity("user", user);
		customerDetail = (Customer) query.uniqueResult();
		
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
	

}
