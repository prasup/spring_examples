package com.lti.runner;

import java.util.List;

import com.lti.model.Customer;
import com.lti.service.CustomerService;
import com.lti.service.CustomerServiceImpl;

public class CustomerRunner
{
	public static void main(String[] args)
	{
		CustomerService service=new CustomerServiceImpl();
		List<Customer> list=service.findAll();
		
		for(Customer c:list)
		{
			System.out.println(c);
		}
	}
}
