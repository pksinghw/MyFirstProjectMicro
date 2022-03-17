package com.Microservices.Bank.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Microservices.Bank.Entity.TransactionEntity;
import com.Microservices.Bank.Repository.TransactionRepository;
import com.Microservices.Bank.Service.TransactionService;
@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository Repo;

	@Override
	public TransactionEntity save(TransactionEntity transaction) {
		TransactionEntity tr=Repo.save(transaction);
		return tr;
	}
	
	
	
	
	
	
	

}
