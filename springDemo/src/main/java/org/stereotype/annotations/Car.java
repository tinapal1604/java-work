package org.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Value("Honda")
	private String make;
	@Value("civic")
	private String model;
	
	public Car() {
		super();
	}
	
	public Car(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}
}
