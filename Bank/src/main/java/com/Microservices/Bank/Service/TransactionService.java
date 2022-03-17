package com.Microservices.Bank.Service;

import com.Microservices.Bank.Entity.TransactionEntity;

public interface TransactionService {
	public TransactionEntity save(TransactionEntity transaction);

}
