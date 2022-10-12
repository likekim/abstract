package com.java.star;

public class Tank extends GroundUnit implements Repairable{

	protected Tank(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}

}
