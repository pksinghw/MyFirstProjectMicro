package com.Microservices.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Bank.Entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {

}
