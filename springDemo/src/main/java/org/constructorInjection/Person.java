package org.constructorInjection;

public class Person {

	private String name;
	private String aadharNo;
	private Education education;

	
	public Person() { super(); }
	 
	public Person(String name, String aadharNo, Education education) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.education = education;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", aadharNo=" + this.aadharNo + "education=" + this.education +" ]";
	}
}
//