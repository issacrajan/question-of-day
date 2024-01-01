package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Issac.Rajan@gmail.com
 *
 */
public class Day02 {

	public static void main(String[] args) throws IOException {
		Day02 day02 = new Day02();
		day02.readFileAndAddToStudentList();
		day02.print();

	}

	public void readFileAndAddToStudentList() throws IOException {
		// TODO update your file name here..
		String fileNameWithPath = "";
		BufferedReader br = new BufferedReader(new FileReader(new File(fileNameWithPath)));

		String line;
		while ((line = br.readLine()) != null) {
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
