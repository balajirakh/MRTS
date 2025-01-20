 package com.BikkatIT.MassRapidTransistSystem.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BikkatIT.MassRapidTransistSystem.Service.TransistCardCustomerService;

import com.BikkatIT.MassRapidTransistSystem.entity.TransistCardCustomer;
import com.BikkatIT.MassRapidTransistSystem.property.AppProperty;

@Controller
@RequestMapping("/api")
public class TransistCardDetailsController {

	@Autowired
	private TransistCardCustomerService trCardCustomerService;

	@Autowired
	private AppProperty appProperty;

	@GetMapping("/transistcard")
	public String loadUserForm(Model model) {

		TransistCardCustomer trCardCustomer = new TransistCardCustomer();

		model.addAttribute("trCardCustomer", trCardCustomer);

		return "transistCardInfo";

	}

	@PostMapping("/savetransistcarddetails")
	public String savetransistcarddetails(TransistCardCustomer trCardCustomer, Model model) {

		boolean saveTransistCardDetails = this.trCardCustomerService.saveTransistCardDetails(trCardCustomer);

		Map<String, String> messages = appProperty.getMessages();

		if (saveTransistCardDetails) {

			model.addAttribute("SUCCESS", messages.get("saveSuccess"));

		} else {
			model.addAttribute("FAIL", messages.get("savefail"));

		}

		return "transistCardInfo";
 
	}

}
