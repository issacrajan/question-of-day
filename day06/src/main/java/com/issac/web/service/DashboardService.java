package com.issac.web.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.issac.web.dto.SalesDTO;

import jakarta.annotation.PostConstruct;

@Service
public class DashboardService {

	private List<SalesDTO> sales = new ArrayList<>();

	public List<SalesDTO> getSales() { return sales; }

	public void setSales(List<SalesDTO> sales) { this.sales = sales; }

	@PostConstruct
	public void init() {
		System.out.println("initializing test data");
		if (sales.isEmpty()) {
			sales.add(new SalesDTO("Maruti", "Jan 2024", 20, new BigDecimal("37909.00")));
			sales.add(new SalesDTO("Maruti 2", "Feb 2024", 20, new BigDecimal("34909.00")));
			sales.add(new SalesDTO("Maruti 3", "Mar 2024", 20, new BigDecimal("45909.00")));
		}
	}
}
