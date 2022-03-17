package com.Microservices.Bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Microservices.Bank.Entity.AccountEntity;
import com.Microservices.Bank.Repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accrepo;

	public ResponseEntity<AccountEntity[]> getAccountEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<AccountEntity[]> getaccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveRecord(AccountEntity ac) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateRecord(AccountEntity ac) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
