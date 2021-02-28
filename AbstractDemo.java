package com;

abstract class Instrument {

	abstract void play();

}

class Piano extends Instrument {

	void play() {

		System.out.println("Piano is playing tan tan tan");

	}

}

class Flute extends Instrument {

	void play() {

		System.out.println("Flute is playing toot toot toot");

	}

}

class Guitar extends Instrument {

	void play() {

		System.out.println("Guitar is playing tin tin tin");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {

		Instrument[] Instruments = { new Piano(), new Piano(), new Piano(), new Flute(), new Flute(), new Flute(),
				new Guitar(), new Guitar(), new Guitar(), new Piano() };

		for (Instrument i : Instruments) {

			i.play();

		}

	}

}