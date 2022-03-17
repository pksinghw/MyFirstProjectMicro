package com.Microservices.Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Bank.Entity.AccountEntity;
import com.Microservices.Bank.Service.AccountService;

@RestController
public class AccountController {

	@RestController
	@RequestMapping("/Acc")
	public class WebController {

		@Autowired
		private AccountService accservice;

		@GetMapping("/get-Account")
		public ResponseEntity<AccountEntity[]> getCustomers() {
			return accservice.getAccountEntity();

		}

		@GetMapping("/get-Accounts")
		public ResponseEntity<AccountEntity[]> getCustomerId(@RequestParam int accountNumber) {

			return accservice.getaccountNumber(accountNumber);
		}

		@PostMapping("/save-record")
		public String saveRecord(@RequestBody AccountEntity ac) {
			return accservice.saveRecord(ac);
		}

		@PutMapping("/update-record")
		public String updateRecord(@RequestBody AccountEntity ac) {
			return accservice.updateRecord(ac);
		}

	}

}
