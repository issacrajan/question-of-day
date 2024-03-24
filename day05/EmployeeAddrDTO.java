package day05;

import java.time.LocalDate;


public class EmployeeAddrDTO {

	private String employeeId;
	private LocalDate effectiveDate;
	private String AddressLine1;
	private String city;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(
			String employeeId) {
		this.employeeId = employeeId;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(
			LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(
			String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(
			String city) {
		this.city = city;
	}

}
