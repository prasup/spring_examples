package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository
{
	public List<Customer> findAll()
	{
		Customer c1=new Customer();
		c1.setFname("Meghana");
		c1.setLname("Surve");

		Customer c2=new Customer();
		c2.setFname("Pratibha");
		c2.setLname("More");
		
		List<Customer> list=new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		
		return list;

	}
}
