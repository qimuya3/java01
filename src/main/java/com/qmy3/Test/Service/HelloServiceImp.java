package com.qmy3.Test.Service;

import org.springframework.transaction.annotation.Transactional;

import com.qmy3.Test.Dao.CustomerDao;
import com.qmy3.Test.domain.Customer;

@Transactional
public class HelloServiceImp implements HelloService  {
	
	
	
	private CustomerDao ctmDao;
	public void setCtmDao(CustomerDao ctmDao) {
		this.ctmDao = ctmDao;
	}

	public void helloService(Customer ctm) {
		// TODO Auto-generated method stub
		System.out.println("业务层：HelloServiceImp is running");
		
		ctmDao.save(null);
	}
}
