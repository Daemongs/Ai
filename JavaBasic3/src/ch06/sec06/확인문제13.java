package ch06.sec06;

import java.util.Scanner;

public class Ȯ�ι���13 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id]");
		String id = sc.next();
		
		System.out.print("password]");
		String password = sc.next();
		
		
		MemberServides memberService = new MemberServides();
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout(id);
		}else {
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	
	
}
