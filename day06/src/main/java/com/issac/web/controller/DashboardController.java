package com.issac.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.issac.web.dto.SalesDTO;
import com.issac.web.service.DashboardService;

@Controller
public class DashboardController {

	private DashboardService dashboardService;

	// auto wiring by constructor
	public DashboardController(DashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}

	@RequestMapping("/dashboard")
	public String displayDashboardPage(Model model) {

		List<SalesDTO> sales = dashboardService.getSales();
		model.addAttribute("sales", sales);

		return "dashboard";
	}

}
