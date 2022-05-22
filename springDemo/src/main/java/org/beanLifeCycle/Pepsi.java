package org.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Implementing bean life cycle using interfaces
public class Pepsi implements InitializingBean, DisposableBean {

	private int price;

	public Pepsi() {
		super();
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("inside setter method");
		
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Pepsi [price=" + this.price + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside initilization method");
		
	}

	
}
