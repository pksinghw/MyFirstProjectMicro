package com.Microservices.Bank.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Microservices.Bank.Entity.AccountCtgry;
import com.Microservices.Bank.Repository.AccountCtgryRepository;

@Service
public class AccountCtgryServiceImpl {

	@Autowired
	AccountCtgryRepository bankRepository;

	// getting all record by using the method findaAll() of CrudRepository
	public List<AccountCtgry> getAllAcc_cat() {
		List<AccountCtgry> banks = new ArrayList<AccountCtgry>();
		bankRepository.findAll().forEach(banks1 -> banks.add(banks1));
		return banks;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public AccountCtgry getacc_CatById(String accTypeId) {
		return bankRepository.findById(accTypeId).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(AccountCtgry banks) {
		bankRepository.save(banks);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(String accTypeId) {
		bankRepository.deleteById(accTypeId);
	}

	// updating a record
	public void update(AccountCtgry banks, String getacc_CatById) {
		bankRepository.save(banks);
	}

}
