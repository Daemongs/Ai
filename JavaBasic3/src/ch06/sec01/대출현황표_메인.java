package ch06.sec01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 대출현황표_메인 {

	public static void main(String[] arps) {
		
		Date now = new Date(); // 현재 날짜를 구해주는 객체
		String nowTime = now.toString (); //날짜를 문자열로 바꾸어준다.
		System.out.println( nowTime ); //화면에 인쇄한다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //날짜출력 형태를 만들어준다.
		System.out.println(sdf.format(now)); //현대 날짜를 출력해준다.
		

		
		int[] iArr = {1,2,3};
		
		//동일한 객체를 생성하고, 내용만 다르게
		
		대출현황표 d1 = new 대출현황표("J02-38", "이민주", new Date(), "주택자금대출",2700000, 48);
		대출현황표 d2 = new 대출현황표("Y04-15", "진영태", new Date(), "예부적금담보대출",300000, 36);
		대출현황표 d3 = new 대출현황표("M02-06", "최철식", new Date(), "무보증신용대출",200000, 36);
		대출현황표 d4 = new 대출현황표("K03-05", "민승렬", new Date(), "국민주택기금대출",1500000, 60);

		대출현황표[] dArr = { new 대출현황표("J02-38", "이민주", new Date(), "주택자금대출",2700000, 48),
								new 대출현황표("Y04-15", "진영태", new Date(), "예부적금담보대출",300000, 36),
								new 대출현황표("M02-06", "최철식", new Date(), "무보증신용대출",200000, 36),
								new 대출현황표("K03-05", "민승렬", new Date(), "국민주택기금대출",1500000, 60)
		};
		
		for (int i=0; i<dArr.length ; i++) {
				System.out.println(dArr[i].get대출번호()+"  "+dArr[i].get성명()+"  "+dArr[i].get대출종류()+"  "+dArr[i].get대출금액()+"  "+dArr[i].get기간()+"");
		}
		int 대출금총합=0;
		int 기간총합=0;
		for(int i=0; i<dArr.length; i++) {
			대출금총합 = 대출금총합+dArr[i].get대출금액();
			기간총합 = 기간총합+dArr[i].get기간();
		}
		double 기간평균 = 기간총합 / (double) dArr.length;
				
		System.out.println("대출금액 총합은" + 대출금총합);
		System.out.println("남은기간 평균은" + 기간평균);
	}
}



            

