package com.java.star;

public class Medic extends GroundUnit implements Repairable2 {
	protected Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		}
	
	void repair(Marine mr) {  
		if(mr instanceof Unit) {
			Unit u = (Unit)mr;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료");
		}
		

		
	}
	
	@Override
	public String toString() {
		return "Medic";
	}
}
