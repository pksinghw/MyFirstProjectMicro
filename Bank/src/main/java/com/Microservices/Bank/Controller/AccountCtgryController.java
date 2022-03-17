package com.Microservices.Bank.Controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountCtgryController {

	protected Logger logger = Logger.getLogger(AccountCtgryController.class.getName());

	@RequestMapping("/category")
	public String doAdd(@RequestParam(defaultValue = "0") String acc_typeid,
			@RequestParam(defaultValue = "0") String acc_name) {

		return "{\"acc_typeid\":\"" + acc_typeid + "\", \"acc_name\":\"" + acc_name + "\"}";
	}

}
