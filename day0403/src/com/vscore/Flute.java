package com.vscore;

public class Flute extends Instrument {

	public static void main(String[] args) {

		Instrument[] in = new Instrument[1];

		in[0] = new Flute();

		for (int i = 0; i < in.length; i++) {
			in[i].volumeUp();
			in[i].volumeDown();
			in[i].play();
		}	
	}
	
	@Override
	public void play() {
		System.out.println("Flute:"+"play( ) ȣ���");
	}
	@Override
	public void volumeUp() {
		System.out.println("Flute:"+"volumeUp( ) ȣ���");
	}
	@Override
	public void volumeDown() {
		System.out.println("Flute:"+"volumeDown( ) ȣ���");
	}

}
