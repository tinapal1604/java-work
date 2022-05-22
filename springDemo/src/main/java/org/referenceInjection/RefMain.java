package org.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
		
		A a = (A) context.getBean("aref");
		System.out.println(a);
		
		
	}

}
