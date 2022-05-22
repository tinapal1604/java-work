package org.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("org/spring/autowiring/autowireConfig.xml");
		/*
		 * Employee e = context.getBean("emp", Employee.class); System.out.println(e);
		 */

		Library lib = context.getBean("lib", Library.class);
		System.out.println(lib);
	}

}
