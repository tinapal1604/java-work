package org.springCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String name;
	private List<String> phones;
	private List<Set> address;
	private Map<String, String> courses;
	
	public Emp() {
		
	}

	public Emp(String name, List<String> phones, List<Set> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public List<Set> getAddress() {
		return address;
	}

	public void setAddress(List<Set> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}
	
	

}
