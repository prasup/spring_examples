package com.lti.runner;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Customer;
import com.lti.service.CustomerService;
//import org.springframework.context.ApplicationContext;



public class CustomerRunner 
{


	
		public static void main(String[] args)
		{
			CustomerService service;//=new CustomerServiceImpl();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=ctx.getBean("service",CustomerService.class);
			List<Customer> list=service.findAll();
			
			for(Customer c:list)
			{
				System.out.println(c);
			}
		}
}

