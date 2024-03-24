package day02;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentDTO {

	private String studentId;
	private Map<String, BigDecimal> marksMap = new HashMap<>();

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(
			String studentId) {
		this.studentId = studentId;
	}

	public Map<String, BigDecimal> getMarksMap() {
		return marksMap;
	}

	public void setMarksMap(
			Map<String, BigDecimal> marksMap) {
		this.marksMap = marksMap;
	}

	public void addMark(
			String subject,
			BigDecimal mark) {
		// write your code to add subject and marks to the map
		marksMap.put(subject, mark);
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", marksMap=" + marksMap + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(
			Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(studentId, other.studentId);
	}

	// test with / without overriding equals and hashcode methods

	// override toString method

}
