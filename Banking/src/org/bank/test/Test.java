package org.bank.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bank.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name="TEST_APP")
public class Test {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setName("Vikas");
		
		Session sessio = HibernateUtil.getSession();
		Transaction ta = sessio.beginTransaction();
		sessio.save(t);
		ta.commit();
		
	}

}
