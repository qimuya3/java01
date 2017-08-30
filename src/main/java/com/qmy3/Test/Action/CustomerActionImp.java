package com.qmy3.Test.Action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qmy3.Test.Dao.CustomerDao;
import com.qmy3.Test.Service.HelloService;

public class CustomerActionImp extends ActionSupport implements ModelDriven<CustomerDao> {
	
	private HelloService helloService;
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
		
	}


	public String sayHello() {
		System.out.println("Web层: CustomerAction sayHello run ...");
		
		helloService.helloService(null);
		return "hello";
	}
	
	public String sayBye() {
		System.out.println("Web层: CustomerAction sayBye ...");
		
		helloService.helloService(null);
		return "success";
	}
	
	public String say2() {
		// TODO Auto-generated constructor stub
		System.out.println("Web层: ask has run ...");
		WebApplicationContext ws = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
	    HelloService hs = (HelloService)ws.getBean("helloService");
		hs.helloService(null);
		return SUCCESS;
	}


	@Override
	public CustomerDao getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
