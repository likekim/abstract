package com.java.inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable aa = f;
		
		if(f instanceof Unit/*Ŭ������ �Ǵ� �������̽���*/) {
			System.out.println("Unit�� ���� Ŭ����");
		}

		if(f instanceof Fighterable) {
			System.out.println("Fighterable�� ���� Ŭ�����̴�");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable�� ���� Ŭ�����̴�");
		}
		
		
	}

}
