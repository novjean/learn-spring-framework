package com.novatech.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.novatech.learnspringframework.game.GameRunner;
import com.novatech.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.novatech.learnspringframework.game") // this is used to scan components in that package
public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		
		//try with resource block
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}




