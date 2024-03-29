package day06;

public class WeatherService {

	private String apiKey;

	public void fetchWeather(
			String city) {
		StringBuilder url = new StringBuilder(
				"https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/");
		url.append(city);
		url.append("?unitGroup=metric");
		url.append("&key=");
		url.append(apiKey);
		url.append("&contentType=json");

	}
}
