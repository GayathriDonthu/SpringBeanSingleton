package com.singleton;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {
	
		public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
			SingletonBean sb1 = (SingletonBean) context.getBean("singletonBean");
		
			sb1.setMessage("Gayathri");
			sb1.getMessage();
			
			SingletonBean sb2 = (SingletonBean) context.getBean("singletonBean");
			sb2.getMessage();
		}
}
