package ch06.sec02;

public class 정적클래스 {

	static int st=10;
	int it = 100;
	
	public static void main(String[] args) {
		//m1();
		//m2();
		정적클래스 i1 = new 정적클래스(); //static 안붙어 있는 멤버들이 힙메모리로 올라간다.
		i1.m2();
		System.out.println( st );
		System.out.println( i1.it );
		m1 (i1);
	}

	
	static void m1(정적클래스 i1) { //자바가 빌드단계에서 자동으로 스택메모리에 올려 둠
		System.out.println("정적 메소드입니다.");
		System.out.println( st );
		System.out.println( i1.it );
	}
	
		void m2() {
			System.out.println("인스턴트 메소드입니다.");
			System.out.println( st );
			System.out.println( it );
		}
	
	
	
	
	
}
