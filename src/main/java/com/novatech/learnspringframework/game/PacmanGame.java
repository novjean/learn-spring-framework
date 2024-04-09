package com.novatech.learnspringframework.game;

import org.springframework.stereotype.Component;

// this is a component that spring will manage
@Component
public class PacmanGame implements GamingConsole {
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}
}
