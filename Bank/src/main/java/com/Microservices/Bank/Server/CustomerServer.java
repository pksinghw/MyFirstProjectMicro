package com.Microservices.Bank.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.Microservices.Bank.Service.CustomerService;
import com.Microservices.Bank.Service.TransactionService;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class CustomerServer {

	public static final String CUSTOMER_SERVICE_URL = "http://customer-service";

	//public static final String TRANJECTION_SERVICE_URL = "http://tranjection-service";

	// public static final String TRANJECTION_SERVICE_URL =
	// public static final String TRANJECTION_SERVICE_URL =
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(CustomerServer.class, args);
	}

	private CustomerService customerService;

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CustomerService customerService() {
		return new CustomerService(CUSTOMER_SERVICE_URL);
	}

	@Bean
	public CustomerServer CustomerController() {
		return new CustomerServer();
	}

//	@Bean
//	public TransactionService tranjectionService() {
//		return new TransactionService(TRANJECTION_SERVICE_URL);
//	}

//	@Bean
//	public HomeController homeController() {
//		return new HomeController();
//	}
}
