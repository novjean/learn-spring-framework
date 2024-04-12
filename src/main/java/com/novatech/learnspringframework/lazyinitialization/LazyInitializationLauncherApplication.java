package com.novatech.learnspringframework.lazyinitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
// when lazy is added the initialization of classB bean does not happen on startup
// only when the classB bean is being used will it get initialized
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("some initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("do something in here");
	}
	
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		//try with resource block
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();
		}
		
	}

}




