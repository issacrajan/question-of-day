package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Issac.Rajan@gmail.com
 *
 */
public class Day02 {

	private List<StudentDTO> studentList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Day02 day02 = new Day02();
		day02.readFileAndAddToStudentList();
		day02.print();

	}

	public void readFileAndAddToStudentList() throws IOException {
		// TODO update your file name here..
		String fileNameWithPath = "/home/issac/work/ws-react-app/question/student.txt";
		BufferedReader br = new BufferedReader(new FileReader(new File(fileNameWithPath)));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			String[] arr = line.split(",");
			String id = arr[0];
			String subject = arr[1];
			String mark = arr[2];

			StudentDTO dto = new StudentDTO();
			dto.setStudentId(id); // Primary key / Unique key

			int index = studentList.indexOf(dto);
			if (index >= 0) {
				// existing or found
				dto = studentList.get(index);
			} else {
				// new
			}
			// write your code here
			// logic
			// Split line using , as delimiter
			// find student Id in the list
			// if found, add subject/mark to the map
			// if not found, NEW record the list and add subject/mark to the map
		}

		// close the BufferedReader

	}

	public void print() {
		// write your code here
	}
}
