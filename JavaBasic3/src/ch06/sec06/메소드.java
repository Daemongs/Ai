package ch06.sec06;

public class 메소드 {

	static int a=10; // 정적필드
	
	static void sm() {
		//정적메소드
		
	}
	
	int b=10; //인스턴트 필드
	//생성자
	
	public 메소드() {
		b=20; // 인스턴트변수의 값을 초기값으로 넣을 수 있다.
	}
	
	static {
		//정적블록
		//b=200; 오류 발생
	}
	
	//상수
	static final double PI = 3.14;
	 void m1() {
		 
	 }
	 
	 int m2() {
		 return 0;
	 }
	 
	 double m3(int ... values) { //가변형 매개변수? ...
		 return 0.0;
	 }
	 
	 double sum (double ... values) {
		 //실수의 합계 수하는 코드
		 return 0.0;
	 }
	 
	 double sum(int ... values) {
		 return 0.0;
	 }
	 
	 
	 
	 
	 
}
