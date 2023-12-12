package ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		Phone p = new Phone();
		p.bell();
		
		p.sendVoice("잘 잤어!");
		p.receiveVoice("잘 잤어 너도 잘 잤어?");

		SmartPhone sp = new SmartPhone();
		
		sp.sendVoice("오늘 뭐할거야?");
		sp.receiveVoice("오늘은 공부해야대");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("아이폰","흰색");
		
		System.out.println(sp2.model);
		sp2.setWifi(true);
		if(sp2.wifi) {
			System.out.println(sp2.model+"에 와이파이가 연결되었습니다");
		}else {
			System.out.println(sp2.color+" 와이파이를 찾을 수 없습니다");
		}
		
		//아이폰은 흰색이고 벨이 울립니다
		System.out.print(sp2.model +"은 "+sp2.color+"이고 ");
		sp.bell();
		
		//아이폰의 메시지가 왔습니다. "자기: 핸드폰 샀어?"
		System.out.println(sp2.model+"의 메세지가 왔습니다 ");
		sp.sendVoice("핸드폰 샀지롱");
		
//		//부모클래스에서 자식의 wifi 필드, 메소드 사용하기
//		부모클래스에서는 자식의 멤버들을 쓸 수 없다
		
//		p.wifi=true;
//		p.setWifi(true);
//		p.internet();
		

		
		
	}

}
