package org.beanLifeCycle;

public class Burger {
	
	private String price;

	public Burger() {
		super();
	}

	public Burger(String price) {
		super();
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void init() {
		
	}
	public void destroy() {
		
	}

	@Override
	public String toString() {
		return "Burger [price=" + this.price + "]";
	}
	
	

}
