package ch06.sec06;

import java.util.Scanner;

public class 확인문제13 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id]");
		String id = sc.next();
		
		System.out.print("password]");
		String password = sc.next();
		
		
		MemberServides memberService = new MemberServides();
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
	}
	
	
	
}
