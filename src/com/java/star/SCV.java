package com.java.star;

public class SCV extends GroundUnit implements Repairable{

	protected SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		}
	
	void repair(Repairable r) {  //SCV, Tank, Dropship
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� �����Ϸ�");
		}
		

		
	}
	
	@Override
	public String toString() {
		return "SCV";
	}

}
