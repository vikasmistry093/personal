package com.solane.dao;

import java.lang.Thread.State;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
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

	@SuppressWarnings("unchecked")
	public List<ProductProcessingHistory> getProductsByProductIdAndStatus(List<Long> productIds, String pickup) {
		Criteria criteria = getSession().createCriteria(ProductProcessingHistory.class, "pph");
		criteria.createAlias("pph.product", "pro");
		if(productIds.size() > 0)
			criteria.add(Restrictions.in("pro.productId", productIds));
		criteria.add(Restrictions.eq("pro.status", pickup));
		
		return criteria.list();
	}

}
