package com.novatech.learnspringframework;

import com.novatech.learnspringframework.game.GameRunner;
import com.novatech.learnspringframework.game.MarioGame;
import com.novatech.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
