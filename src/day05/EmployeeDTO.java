package day05;

import java.time.LocalDate;

public class EmployeeDTO {

	private String employeeId;
	private String employeeName;
	private LocalDate joinedDate;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(
			String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(
			String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(
			LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}

}
