package ch06.sec03;

import ch06.sec04.AA;
import ch06.sec05.Singleton;

public class 접근제한자 {

	public static void main(String[] args) {
		
		
		Singleton o1 = Singleton.getInstance();
		System.out.println( o1);

		
		
		
		
		A aAdd = new A(); //객체화 하기
		
//		System.out.println(aAaa.a); 에러, private 다른 객체에서 못씀
		System.out.println(aAdd.b);
		//접근제한자가 default이니까 같은 패키지는 가능하다.
		System.out.println(aAdd.c);
		// 접근제한자가 public이니까 가능하다.
		
		// aAdd.a1(); 에러 priate 다른 객체...
		aAdd.b1();
		aAdd.c1();
		
		AA aaAadd = new AA();
//		System.out.println(aaAdd.a); 에러, private 다른 객체에서 못씀
//		System.out.println(aaAdd.b); 에러, defalut 같은 패키지에서 가능
//		System.out.println( aaAdd.c ); // 접근제한자가 public이기에 가능하다.
		
//		aaAdd.a1();
//		aaAdd.b1(); */
		
//		aaAdd.c1();
		
	//실제로 개발할 때는 변수는 prevate하고 메소드는 public으로 합니다.
	
	}

}
