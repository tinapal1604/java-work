package org.spring.autowiring;

public class Company {
	
	private String companyName;
	private String employeeId;
	
	public Company() {
		super();
		
	}
	
	public Company(String companyName, String employeeId) {
		super();
		this.companyName = companyName;
		this.employeeId = employeeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + this.companyName + ", employeeId=" + this.employeeId + "]";
	}
	
}
