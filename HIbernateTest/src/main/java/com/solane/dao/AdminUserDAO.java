package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.AdminUser;

@Repository
@Transactional
public class AdminUserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.openSession();
    }
	
	@SuppressWarnings("unchecked")
	public List<AdminUser> getAdminUserInfoByStatus(String free) {
		Criteria critreia = getSession().createCriteria(AdminUser.class);
		critreia.add(Restrictions.eq("status", free));
		return critreia.list();
	}

	public void saveDummyUsers(AdminUser adminUser) {
		getSession().save(adminUser);
	}

	public AdminUser getAdminUserInfoById(String adminUserId) {
		return getSession().get(AdminUser.class, Long.parseLong(adminUserId));
	}

	public void saveorUpdate(AdminUser adminUser) {
		getSession().saveOrUpdate(adminUser);
	}

}
