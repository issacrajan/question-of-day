package com.issac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.issac.web.dto.LoginDTO;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayHomePage(Model model) {
		LoginDTO login = new LoginDTO();
		login.setUserId("issac1234");
		model.addAttribute("login", login);

		return "index";
	}

	@RequestMapping("/index")
	public String displayLoginPage(Model model) {
		return homePage(model);
	}

	private String homePage(Model model) {
		LoginDTO login = new LoginDTO();
		login.setUserId("issac");
		model.addAttribute("login", login);

		return "index";
	}

	@RequestMapping(value = "/index2", method = RequestMethod.POST)
	public String submitLoginPage(Model model, @ModelAttribute("login") LoginDTO login) {

		System.out.println(login);
		model.addAttribute("login", login);

		return "redirect:dashboard";
	}
}
