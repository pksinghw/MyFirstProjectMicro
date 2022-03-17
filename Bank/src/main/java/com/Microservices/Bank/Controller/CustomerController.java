package com.Microservices.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Microservices.Bank.Entity.Customer;
import com.Microservices.Bank.Service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Customer> listCustomer = service.listAll();
		model.addAttribute("listCustomer", listCustomer);
		System.out.println("Get / ");
		return "index";

	}

	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("customer", new Customer());
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("Customer") Customer cus) {
		service.save(cus);
		return "redirect:/";
	}

	public ModelAndView showEditCustomerPage(@PathVariable(name = "id") String id) {
		ModelAndView mav = new ModelAndView("new");
		Customer cus = service.get(id);
		return mav;
	}

}
