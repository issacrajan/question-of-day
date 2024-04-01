package com.issac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.issac.web.dto.LoginDTO;
import com.issac.web.exception.InvalidLogin;
import com.issac.web.service.UserService;

@Controller
public class IndexController {

	private UserService userService;

	public IndexController(UserService userService) {
		this.userService = userService;
	}

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

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String submitLoginPage(Model model, @ModelAttribute("login") LoginDTO login,
			BindingResult result) {

		System.out.println(login);

		try {
			userService.validateLogin(login);
		} catch (InvalidLogin ex) {
			String errMsg = ex.getMessage();

			ObjectError error = new ObjectError("globalError", errMsg);
			result.addError(error);

			return "index";

		}
		model.addAttribute("login", login);

		return "redirect:dashboard";
	}
}
