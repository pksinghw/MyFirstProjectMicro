package com.Microservices.Bank.Service;

import java.util.List;

import com.Microservices.Bank.Entity.Customer;
import com.Microservices.Bank.Repository.CustomerRepository;

public interface CustomerService {
	
		public Customer save(Customer customer);

		public List<Customer> listAll();

		public Customer get(String id);

		CustomerRepository save(CustomerRepository customer);

	}

