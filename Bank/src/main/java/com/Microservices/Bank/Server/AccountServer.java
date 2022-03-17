package com.Microservices.Bank.Server;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountServer {

	protected Logger logger = Logger.getLogger(AccountServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "BankServer");

		SpringApplication.run(AccountServer.class, args);

	}
}
