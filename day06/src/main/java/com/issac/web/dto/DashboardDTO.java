package com.issac.web.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DashboardDTO {

	private List<SalesDTO> sales = new ArrayList<>();

	public List<SalesDTO> getSales() { return sales; }

	public void setSales(List<SalesDTO> sales) { this.sales = sales; }

	public void init() {
		if (sales.isEmpty()) {
			sales.add(new SalesDTO("Maruti", "Jan 2024", 20, new BigDecimal("37909.00")));
		}
	}
}
