package ch06.sec06;

public class SportsCar {

	//필드 = 항목 = 변수
	int a;
	
	//메소드 = 함수 = 동작
	void aPrinter() {
		System.out.println(a);
}

	//생성자
	public SportsCar() {
	//기본생성자 객체화할때 초기값을 넣을 때 이용
	//생성자를 1개라도 안 만들면 자바가 기본생성자를 자동으로 만들어 준다.
	//만약에 1개라도 만들면 자바가 안 만들어 준다.
}
	
	public SportsCar(int a) {
		this.a = a;
	}
}
