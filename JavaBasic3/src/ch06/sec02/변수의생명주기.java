package ch06.sec02;

public class 변수의생명주기 {

	
	int c=10; // 메소드 밖의 있는 것 전역 변수
	
	public static void main(String[] args) {

		int a=10; //변수가 태어나기. 생성 main()안에서만 쓸 수 있다. 생성된 곳의 {} 안에서만 가능함
		//System.out.println(c);
		
		for (int i=0; i<10; i++) { //for속에서만 태어나서 for에서만 사용된다??
			int j=8;
			System.out.println( i);
		}
		//System.out.println( i); << 변수선언되지 않아서 에러난다.
		
		
		
		
		
		
		
	}

	void method01() {
		int b=20; //지역변수
//		System.out.println(a); // 변수가 선언되지 않았기에 에러
		System.out.println(c);
		
				
	}
	
	
	
	void method02() {
		int b=20;
//		System.out.println(b); // 변수가 선언되지 않았기에 에러
		System.out.println(c);

		
	}
}

