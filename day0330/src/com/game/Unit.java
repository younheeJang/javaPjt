package com.game;


//�߻�Ŭ����
public abstract class Unit {

	
	int x, y;

	//�߻� �޼ҵ�
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();

}
