package com.java.star;

public class Dropship extends AirUnit implements Repairable{

	protected Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}

}
