package com.inher;


public class Mp3Phone extends Cellphone{
int size;//저장용량

public Mp3Phone(String model, String num, int chord, int size) {
	this.model = model;
	this.number = num; //this를 안 붙여도 상관이 없다. 확장했기 때문
	this.chord = chord;
	this.size =size;
}

}
