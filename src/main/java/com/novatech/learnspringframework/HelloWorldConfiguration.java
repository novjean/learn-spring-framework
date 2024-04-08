package com.novatech.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record is a new feature introduced in java 16
// eliminate the verbosity by automatically creating constructor, getter, setter, toString and more
record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Nova";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Main Street" , "Utrecht"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
		
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
		
	}
	
	@Bean
	@Primary
	public Person person5Qualifier(String name, int age,@Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
		
	}
 
	@Bean(name = "address2")
	@Primary
	public Address address() {
		var address = new Address("Baker Street", "London");
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		var address = new Address("Hadapsar", "Pune");
		return address;
	}
}
