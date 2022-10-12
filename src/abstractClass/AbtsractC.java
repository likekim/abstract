package abstractClass;

public abstract class AbtsractC {
	//추상클래스
	//1. abstract 제한을 붙여서 클래스를 선언한다
	//2. 일반 클래스와 동일하게 멤버를 정의한다
	//3. 추상 메소드를 정의한다(선언부만 존재한다 구현부X)
	//4. 생성이 불가하다
	//5. 반드시 자식 클래스에 상속해야 한다(상속을 위한 클래스)
	//6. 자식 클래스는 반드시 추상 메소드를 오버라이딩 해야 한다
	
	int x;
	
	AbtsractC() {
		
	}
	
	void method() {
		
	}
	
	abstract void abstractMethod();  //추상메소드
}
