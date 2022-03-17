package com.Microservices.Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Bank.Entity.TransactionEntity;
import com.Microservices.Bank.Service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService service;
	@PostMapping("/save")
	public ResponseEntity<TransactionEntity>save(@RequestBody TransactionEntity trans){
		
		service.save(trans);
		return new ResponseEntity<TransactionEntity>(trans,HttpStatus.CREATED);
		
	}

}
