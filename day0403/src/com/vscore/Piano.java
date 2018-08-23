package com.vscore;

public class Piano extends Instrument {
	public static void main(String[]  args) {
		Instrument[] in = new Instrument[1];
		in[0] = new Piano();
				
				for(int i = 0; i<in.length; i++) {
					in[i].volumeUp();
					in[i].volumeDown();
					in[i].play();
				}
	}
	
	@Override
	public void play() {
		System.out.println("Piano:"+"play( ) ȣ���");
	}

	@Override
	public void volumeUp() {
		System.out.println("Piano:"+"volumeUp( ) ȣ���");
	}

	@Override
	public void volumeDown() {
		System.out.println("Piano:"+"volumeDown( ) ȣ���");
	}
	
}

