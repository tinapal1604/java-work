package org.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("CConfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
//		Education edu = (Education) context.getBean("pref");
//		System.out.println(edu);

	}

}
