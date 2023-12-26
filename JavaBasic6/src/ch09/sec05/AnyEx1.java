package ch09.sec05;

public class AnyEx1 {

	public static void main(String [] args) {
		
		B b= new B();
		b.bM();
	
		//B클래스의 자식클래스가 필요. 왜냐면 bM()재정의해서 사용하려고
		B bb = new B() {
					
					int b=20;
					
					@Override
					void bM() {
						System.out.println("자식 메소드"+20);
					}
		};
		//부모클래스를 new하고 뒤에 {}을 써서 자식의 클래스의 내용을 써 주는 것
			bb.bM();
		
	}
}


Class B{
	void bM() {
		System.out.println("부모메소드");
		
	}
}