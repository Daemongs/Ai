package ch07.sec12;

import java.util.Scanner;

public class Promotion4 {

	public static void main(String[] args) {
	Promotion4 p = new Promotion4();
	p.menuDisplay();
	int choice = 0;
	while (choice !=5) {
		choice = p.menuChoice();
		p.output(choice);
	}
	
	System.out.println(choice);
	
	}

	public void menuDisplay() {
		//메뉴판 메소드
		System.out.println("-------------------------------");
		System.out.println("1.밥 2.떡볶이 3.햄버거 4.피자 5.종료");
		System.out.println("-------------------------------");

	}
	
	//입력받는 메소드
	public int menuChoice () {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요 >");
		int choice;
		choice = sc.nextInt();
		return choice;
	}
	
	public void output (int choice) {
		//주문한 메뉴 나가기
		if (choice ==5) {System.out.println("재료 소진"); return;}
						
		A a = null;
		switch (choice) {
			case 1: a = new A(); break;
			case 2: a = new B(); break;
			case 3: a = new BB(); break;
			case 4: a = new C(); break;
			default : 
		
		}
		a.eat(); 
		System.out.println("맛있게 드세요");
	}
	
	
}




class A{
   void eat() {
      System.out.println("밥");
   }
}
class B extends A{
   @Override
   void eat() {
      System.out.println("떡볶이");
   }
}
class BB extends A{
   @Override
   void eat() {
      System.out.println("햄버거");
   }
}
class C extends B{
   @Override
   void eat() {
      System.out.println("피자");
   }
}