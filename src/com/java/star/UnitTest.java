package com.java.star;

public class UnitTest {

	public static void main(String[] args) {
		Tank t= new Tank(150);
		Dropship d = new Dropship(200);
		SCV scv = new SCV(40);
		
		Marine mr= new Marine(40);
		Medic med = new Medic(50);
		
		scv.repair(t);
		scv.repair(d);
		med.repair(mr);
		

	}

}
