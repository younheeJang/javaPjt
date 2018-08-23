package com.vscore;

public class Main {

	public static void main(String[] args) {

		Instrument[] in = new Instrument[2];

		in[0] = new Piano();
		in[1] = new Flute();

		for (int i = 0; i < in.length; i++) {

			in[i].volumeUp();
			in[i].volumeDown();
			in[i].play();
		}
	}

}
