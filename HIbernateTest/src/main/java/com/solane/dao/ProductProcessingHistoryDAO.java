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
import com.solane.model.ProductProcessingHistory;

@Repository
@Transactional
public class ProductProcessingHistoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	public void saveorUpdate(ProductProcessingHistory productProcessingHistory) {
		getSession().saveOrUpdate(productProcessingHistory);
	}

	@SuppressWarnings("unchecked")
	public List<ProductProcessingHistory> getProductByUser(UserInfo user) {
		Criteria criteria = getSession().createCriteria(ProductProcessingHistory.class);
		criteria.add(Restrictions.eq("user.userId", user.getUserId()));
		return criteria.list();
	}

}
