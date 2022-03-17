package com.Microservices.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Bank.Entity.AccountCtgry;

public interface AccountCtgryRepository extends JpaRepository<AccountCtgry, String> {

}
