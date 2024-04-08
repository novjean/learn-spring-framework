package com.novatech.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.novatech.learnspringframework.game.GameRunner;
import com.novatech.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		//try with resource block
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
