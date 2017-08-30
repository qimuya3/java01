package com.qmy3.Test.Dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qmy3.Test.domain.Customer;

/**
 * 继承HibernateDaoSupport，使用它的Hibernate模板
 * @author w
 *
 */
public class CustomerDaoImp implements CustomerDao {
	private HibernateTemplate template;

    public CustomerDaoImp(SessionFactory sessionFactory) {
         
        this.template = new HibernateTemplate(sessionFactory);
         
    }
	
	public void save(Customer ctm) {
		System.out.println("持久层：CustomerDaoImp  save run");
		
		ctm = new Customer();
		ctm.setName("ree");
		ctm.setAge(new Long(15));
		ctm.setSex(new Long(1));
		ctm.setUuid(new Long((int)Math.random()));
		
		HibernateTemplate hTemplate = this.template;
		System.out.println("htl is " + hTemplate);
		hTemplate.update(ctm);
		
		System.out.println("持久层：CustomerDaoImp  save well");
	}

}
