package ch07.sec09;

public class PromotionExample {


public static void main(String[]args) {
	
	double d11;
	float f11 = 1.1f;
	d11 = f11;

	//자료형은 변수의 자료타입
	//자료형 변수명 = 힙메모리에 올려라
		A 	a = new A();
		B 	b = new B();
		C 	c = new C();
		D 	d = new D();
		E	e = new E();
		
		A	b1 = new B(); //자식의 객체화 할 때 변수를 부모 변수로 받는다. 자동형변환
		A	c1 = new C();
		B	d1 = new D();
		C	e1 = new E();
		A	d2 = new D();
		A	e2 = new E();
		
//		double d11;
//		float f11=1.1f;
//		d11 = f11;;
}

}
