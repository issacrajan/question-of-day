package com.issac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String arrayController(Model model) {
		String[] continents = { "Africa", "Antarctica", "Asia", "Australia", "Europe", "North America",
				"Sourth America" };

		model.addAttribute("continents", continents);

		return "test";
	}
}
