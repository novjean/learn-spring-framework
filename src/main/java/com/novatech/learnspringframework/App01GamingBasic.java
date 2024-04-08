package com.novatech.learnspringframework;

import com.novatech.learnspringframework.game.GameRunner;
import com.novatech.learnspringframework.game.MarioGame;
import com.novatech.learnspringframework.game.PacmanGame;
import com.novatech.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		// game is a dependency of the gamerunner class
		// it is injected to the class
		
		gameRunner.run();

	}

}
