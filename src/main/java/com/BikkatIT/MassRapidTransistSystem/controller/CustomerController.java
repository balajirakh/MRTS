package com.BikkatIT.MassRapidTransistSystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkatIT.MassRapidTransistSystem.Service.CustomerServiseI;
import com.BikkatIT.MassRapidTransistSystem.Service.EmailService;
import com.BikkatIT.MassRapidTransistSystem.entity.Customer;
import com.BikkatIT.MassRapidTransistSystem.property.AppProperty;

@Controller
public class CustomerController {

	@Autowired
	private CustomerServiseI customerServiseI;

	@Autowired
	private AppProperty appProperty;
	
	 @Autowired
	 private EmailService emailService;
	
	@GetMapping("/login" )
	public String loadUserForm1(Model model) {

		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "login";

	}


	@GetMapping("/customer")
	public String loadUserForm(Model model) {

		Customer customer = new Customer();

		model.addAttribute("customer", customer);

		return "userInfo";

	}

	@PostMapping("/savecustomer")
	public String saveCustomer(Customer customer, Model model) {

		boolean saveCustomer = customerServiseI.saveCustomer(customer);

		
		
		Map<String, String> messages = appProperty.getMessages();

		if (saveCustomer) {

			model.addAttribute("SUCCESS", messages.get("saveSuccess"));

		} else {
			model.addAttribute("FAIL", messages.get("savefail"));

		}

		return "userInfo";

		}
	
	 @PostMapping("/api/register")
	    public String registerCustomer(@RequestBody Customer customer) {
	        // Save customer data to the database
	        // Here you would typically call your repository to save the customer
	        
	        // Send OTP to the registered email
	        emailService.sendOTP(customer);
	        
	        return "Customer registered successfully!";
	    }
	
	
	
	
	@GetMapping("/getallcustomers")
	public String getAllcustomers(Model model){
		
		List<Customer> allCustomer = this.customerServiseI.getAllCustomer();
		
		model.addAttribute("allcustomer",allCustomer);
		
		
		return "allcustomers";
		
		
		
		
		
		
	}
	

}
