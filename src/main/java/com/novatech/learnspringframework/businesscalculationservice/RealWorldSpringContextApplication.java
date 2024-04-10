package com.novatech.learnspringframework.businesscalculationservice;

import java.util.Arrays;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class RealWorldSpringContextApplication {
	
	public static void main(String[] args) {
		//try with resource block
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextApplication.class)){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
		
	}

}




