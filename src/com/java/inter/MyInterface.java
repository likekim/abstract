package com.java.inter;

public interface MyInterface {
	//인터페이스
	//1. 생성이 불가하다
	//2. 클래스처럼 멤버를 정의할 수 없다
	//3. 두 가지 형식의 멤버만 정의할 수 있다(추상메소드, final 상수, (디폴트 메소드))
	//   --멤버의 제한자는 생략 가능하다
	//4. 반드시 클래스에 상속해야 한다
	//5. 자식 클래스는 추상메소드를 오버라이딩 해야 한다
	//6. 인터페이스 간 상속도 가능하다
	//7. 다중 상속이 가능하다
	//8. 클래스와 동일하게 다형성을 적용할 수 있다
	
//	public static final int MA = 100;  //public static final 
//	public abstract void method();     //public 
	
	final int MA = 100;
	void method();
}
