package com.game;


//추상클래스
public abstract class Unit {

	
	int x, y;

	//추상 메소드
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();

}
