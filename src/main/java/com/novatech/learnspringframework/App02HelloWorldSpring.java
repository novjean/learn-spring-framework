package com.novatech.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. launch a spring context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2. configure the things that we want Spring to manage - @Configuration
		// HelloWorldConfiguration
		
		
		//3. retrieve beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person")); // the toString of the record gets printed
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		//System.out.println(context.getBean(Address.class)); // retrieve bean by type
		
		
		
	}

}
