package com.solane.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.ProductProcessingHistory;

@Repository
@Transactional
public class ProductProcessingHistoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.openSession();
    }

	public void saveorUpdate(ProductProcessingHistory productProcessingHistory) {
		getSession().saveOrUpdate(productProcessingHistory);
	}

}
