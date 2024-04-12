package com.novatech.learnspringframework.cdi;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
// named is replacement for component
class BusinessService {
	private DataService dataService;
	
	
	public DataService getDataService() {
		return dataService;
	}
	
	//@Autowired
	@Inject
	// inject is replacement for autowired
	public void setDataService(DataService dataService) {
		System.out.println("setter injection");
		this.dataService = dataService;
	}
}

@Named
class DataService {
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	
	public static void main(String[] args) {
		//try with resource block
		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
		
	}

}




