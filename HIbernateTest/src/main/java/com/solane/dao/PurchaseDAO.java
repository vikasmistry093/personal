package com.solane.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.Purchase;

@Repository
@Transactional
public class PurchaseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	public Purchase get(Purchase purchase) {
		return getSession().get(Purchase.class, purchase);
	}
}
