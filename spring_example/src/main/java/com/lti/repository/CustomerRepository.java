package com.lti.repository;

import java.util.List;

import com.lti.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}