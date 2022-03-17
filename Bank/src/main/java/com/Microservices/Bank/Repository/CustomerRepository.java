package com.Microservices.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Bank.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
