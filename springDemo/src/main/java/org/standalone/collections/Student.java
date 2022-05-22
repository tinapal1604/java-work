package org.standalone.collections;

import java.util.List;
import java.util.Map;

public class Student {
	
	private String studentName;
	private List<String> courses;
	private Map<String, Integer> feeStructure;
	
	public Student() {
		super();
	}

	public Student(String studentName, List<String> courses, Map<String, Integer> feeStructure) {
		super();
		this.studentName = studentName;
		this.courses = courses;
		this.feeStructure = feeStructure;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", courses=" + courses + ", feeStructure=" + feeStructure + "]";
	}

}
