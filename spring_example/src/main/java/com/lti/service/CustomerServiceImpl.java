package com.lti.service;

import java.util.List;

import com.lti.model.Customer;
import com.lti.repository.CustomerRepository;
import com.lti.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService
{
	CustomerRepository repository=new CustomerRepositoryImpl();
	
	public List<Customer> findAll()
	{
		return repository.findAll();
	}
}
