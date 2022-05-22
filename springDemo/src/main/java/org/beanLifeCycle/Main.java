package org.beanLifeCycle;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("org/beanLifeCycle/lifeCycleConfig.xml");
//		Burger b = (Burger) context.getBean("burger");
//		System.out.println(b);
		//Pepsi p = (Pepsi) context.getBean("p1");
		//System.out.println(p);
		Subject s = (Subject) context.getBean("sub");
		System.out.println(s);
		context.registerShutdownHook();
		

	}

}
