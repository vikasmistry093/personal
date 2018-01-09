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
	

}
