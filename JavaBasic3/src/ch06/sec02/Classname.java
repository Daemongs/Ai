package ch06.sec02;

//250p.
public class Classname {

	//상수 const
	static final int A = 100;
	static final double PI = 3.141592;
	static final double RATE = 0.025;
	//변수 = 변하는 수
	int a=10;

	
	//인스턴트 멤버들
	int field;
	void method() {
		a=a+100;
		System.out.println(A + 20);
		//A = 1000; 에러, 상수이기 때문에 바꾸지 못함
	};
		
		
	
	//정적 멤버들 (클래스 맴버들)
	static int field2;
	static void method2() { };
	
	//정적 블록 선언
	static {
		//field 오류 = 10; 오류 왜? 메모리 올라가는 시점이 다르다
		// method(); 오류
//		field = 10;
//		method();
		field2 = 20;
		method2();
		
	}
	
	//정적 메소드 선언
	static void method3()
//	this field1 = 10;
//	this.method1();
	field2 = 10;
	method2();
}
}
