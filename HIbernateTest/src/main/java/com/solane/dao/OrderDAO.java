package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.mapper.model.UserInfo;
import com.solane.model.Order;

@Repository
@Transactional
public class OrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	public List<Order> getOrdersByStatus(String status) {
		Criteria critreia = getSession().createCriteria(Order.class);
		critreia.add(Restrictions.eq("status", status));
		return critreia.list();
	}

}
