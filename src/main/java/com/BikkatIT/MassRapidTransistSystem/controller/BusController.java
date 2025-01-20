package com.BikkatIT.MassRapidTransistSystem.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BikkatIT.MassRapidTransistSystem.Service.BusService;
import com.BikkatIT.MassRapidTransistSystem.entity.Bus;

import com.BikkatIT.MassRapidTransistSystem.property.AppProperty;

@Controller
@RequestMapping("/api")
public class BusController {

	@Autowired 
	private BusService busService;
	@Autowired
	private AppProperty appProperty;

	@GetMapping("/bus")
	public String loadUserForm(Model model) {

		Bus bus = new Bus();

		model.addAttribute("bus", bus);

		return "busInfo";

	}

	@PostMapping("/bookbus")
	public String bookbus(Bus bus, Model model) {

		boolean saveBusDetails = this.busService.saveBusDetails(bus);

		Map<String, String> messages = appProperty.getMessages();
		if (saveBusDetails) {

			model.addAttribute("SUCCESS", messages.get("TravellingDetailsSave"));

		} else {
			model.addAttribute("FAIL", messages.get("TravellingDetailssavefail"));

		}

		return "busInfo";

	}

}
