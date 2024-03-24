package day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day01 {
	List<String> inputList = new ArrayList<>();

	Map<String, String> monthWiseMaxDayMap = new HashMap<String, String>();

	public static void main(String[] args) {

		Day01 day01 = new Day01();
		day01.initData();
		day01.process();
	}

	// find Monthwise max day and place in to the map
	// output

	//@formatter:off
	/*
	 * 
	 * KEY -- Value 
	 * JAN -- 2023-01-21 
	 * FEB -- 2023-02-25 
	 * MAR -- 2023-03-29
	 * 
	 * 
	 */
	//@formatter:on
	private void process() {
		// write your code here

		for (String input : inputList) {
			int index = input.indexOf('=');// separator for month and day
			String month = input.substring(0, index);
			String day = input.substring(index + 1);

			if (monthWiseMaxDayMap.containsKey(month)) {
				String maxDay = monthWiseMaxDayMap.get(month);
				int inpuDay = Integer.parseInt(day.substring(day.length() - 2, day.length()));
				int existingDay = Integer.parseInt(maxDay.substring(maxDay.length() - 2, maxDay.length()));
				if (inpuDay > existingDay) {

					monthWiseMaxDayMap.put(month, day);
				}
			} else {
				monthWiseMaxDayMap.put(month, day);
			}

		}
		for (String key : monthWiseMaxDayMap.keySet()) {
			System.out.println("KEY:" + key + " " + "VALUE:" + monthWiseMaxDayMap.get(key));
		}
	}

	private void initData() {
		inputList.add("JAN=2023-01-01");
		inputList.add("JAN=2023-01-11");
		inputList.add("JAN=2023-01-21");

		inputList.add("FEB=2023-02-25");
		inputList.add("FEB=2023-02-01");

		inputList.add("FEB=2023-03-01");
		inputList.add("MAR=2023-03-29");
		inputList.add("FEB=2023-01-21");
	}

}
