package com.Microservices.Bank.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Microservices.Bank.Entity.Customer;
import com.Microservices.Bank.Repository.CustomerRepository;
import com.Microservices.Bank.Service.CustomerService;


	@Service
	public class CustomerServiceImpl implements CustomerService {
		
		@Autowired
		private CustomerRepository Repo;

		@Override
		public CustomerRepository save(CustomerRepository customer) {
		CustomerRepository tr=Repo.save(customer);
			return tr;
		}

		@Override
		public Customer save(Customer customer) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> listAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Customer get(String id) {
			// TODO Auto-generated method stub
			return null;
		}
		

}
