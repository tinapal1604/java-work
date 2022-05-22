package org.constructorInjection;

public class Education {

	String collegeName;
	String schoolName;

	public Education(String collegeName, String schoolName) {
		super();
		this.collegeName = collegeName;
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Education [collegeName=" + this.collegeName + ", schoolName=" + this.schoolName + "]";
	}
	
	
}
