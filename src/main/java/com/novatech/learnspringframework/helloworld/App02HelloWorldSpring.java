package com.novatech.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. launch a spring context
		// below try is called try with resources
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			//2. configure the things that we want Spring to manage - @Configuration
			// HelloWorldConfiguration
			
			
			//3. retrieve beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person")); // the toString of the record gets printed
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class)); // retrieve bean by type
			
			//System.out.println(context.getBean(Person.class)); 
			
			System.out.println(context.getBean("person5Qualifier"));
			
			//displaying all the beans
//			Arrays.stream(context.getBeanDefinitionNames()).forEach((e) -> {
//				System.out.println(e);
//			}); 
			
			//this is called a method reference and it gives the same result as the code above
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); 
		};
		

	}

}
