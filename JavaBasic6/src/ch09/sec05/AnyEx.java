package ch09.sec05;

public class AnyEx {

	public static void main(String[] args ) {
		
		AA aa = new AA(); //
		aa.iaM();
		
		// 자식이름 없이 자식클래스 객체화
		A a = new A() {
			@Override
			void iaM() {
				System.out.println("이름없는 자식클래스 내용 부모객체화에 {}넣고 바로 자식 클래스 만듬")
			}
			
		};
		a.iaM()''
	}
	
	
}

class A


