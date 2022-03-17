package com.Microservices.Bank.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Microservices.Bank.Entity.TransactionEntity;
@Repository
public interface TransactionRepository extends CrudRepository<TransactionEntity, Integer> {

}
