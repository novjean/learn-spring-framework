package com.novatech.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.novatech.learnspringframework.game.GameRunner;
import com.novatech.learnspringframework.game.GamingConsole;
import com.novatech.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
	
}
