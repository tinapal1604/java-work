package org.spring.autowiring;

public class Employee {
	
	private String name;
	private Company obj;

	public Employee() {
		super();
	}
	
	public Employee(String name, Company obj) {
		super();
		this.name = name;
		this.obj=obj;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Company getObj() {
		return obj;
	}

	public void setObj(Company obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", companyName=" + this.obj + "]";
	}

	
}
