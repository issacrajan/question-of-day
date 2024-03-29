package com.issac.web.dto;

import java.math.BigDecimal;

/**
 * 
 * @author
 *
 */
public class SalesDTO {

	private String productName;
	private String monthYear;
	private Integer saleQuantity;
	private BigDecimal saleAmt;

	public SalesDTO() {
	}

	public SalesDTO(String productName, String monthYear, Integer saleQuantity,
			BigDecimal saleAmt) {
		this.productName = productName;
		this.monthYear = monthYear;
		this.saleQuantity = saleQuantity;
		this.saleAmt = saleAmt;
	}

	public String getProductName() { return productName; }

	public void setProductName(String productName) { this.productName = productName; }

	public String getMonthYear() { return monthYear; }

	public void setMonthYear(String monthYear) { this.monthYear = monthYear; }

	public Integer getSaleQuantity() { return saleQuantity; }

	public void setSaleQuantity(Integer saleQuantity) { this.saleQuantity = saleQuantity; }

	public BigDecimal getSaleAmt() { return saleAmt; }

	public void setSaleAmt(BigDecimal saleAmt) { this.saleAmt = saleAmt; }

}
