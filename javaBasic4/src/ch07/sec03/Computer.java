package ch07.sec03;
//자식 클래스
public class Computer extends Calculator{
	//메소드 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle() 실행");
		return 2*3.14*r; //원둘레 구하기 (반지름구하기?)
	}
	
	
	
}
