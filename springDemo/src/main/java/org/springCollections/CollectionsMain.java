package org.springCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Emp e = (Emp) context.getBean("emp1");
		System.out.println(e);
		

	}

}
