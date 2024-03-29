package day06.dto;

import java.util.List;

public class WeatherDTO {
	private String address;

	private List<DayDTO> days;

	public String getAddress() {
		return address;
	}

	public void setAddress(
			String address) {
		this.address = address;
	}

	public List<DayDTO> getDays() {
		return days;
	}

	public void setDays(
			List<DayDTO> days) {
		this.days = days;
	}

}
