package ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// 656
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();

		//삽입, 넣기
		m1.put( 1, "이순신");
		m1.put( 2 ,"박수연");
		m1.put( 3 ,"홍길동");
		m1.put( 3 ,"홍길동1");
		m1.put( 3 ,"홍길동2");
		
		//출력하기, 꺼내 보기 get()
		System.out.println(  m1.get( 3 ) ); //키를 넣으면 값이 나온다
		
		//삭제하기 
		m1.remove(3);
		
		//전체 출력하기
		// 1단계 키들을 모은다 keySet() 
		// 2단계 키 1개씩 출력한다 
		Set<Integer> m1Keys = m1.keySet(); // 1단계 키들을 모은다 keySet() 
		
		Iterator<Integer>  it1 = m1Keys.iterator();
		while( it1.hasNext() ) {
			// System.out.println(  it1.next() + " @@@@ ");
			System.out.println( m1.get(  it1.next() ) + "@@@" ); //values 값 인쇄
		}
		
		
		System.out.println( m1.size() + "~~");
		
		Map<String, Double> m2 = new HashMap<String, Double>();
		//m2에 값 넣어기
		m2.put("a", 2.5);
		m2.put("b", 3.5);
		m2.put("b", 3.5);
		m2.put("b", 3.5);
		m2.put("b", 13.5);
		// 3.5 출력해 보기
		System.out.println( m2.get("b") );
		
		//크기 구하기
		System.out.println( m1.size() ); //키가 동일하면 동등객체로 판단하고 새로운 것을 대체한다. 즉 마지막 키의 값으로 남는다
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("홍길동", "과장");
		m3.put("이순신", "부장");
		m3.put("최경미", "사원");
		m3.put("홍길동", "사장");
		
		//크기는? 회사 인원수는?
		System.out.println( m3.size() );
		//이순신의 직책은?
		System.out.println(   m3.get( "이순신")  );
		//최경미의 직책은?
		System.out.println(   m3.get( "최경미")  );
		//홍길동의 직책은?
		System.out.println(   m3.get( "홍길동")  );
		//최경미가 퇴사했다 삭제하기
		m3.remove("최경미");
		
		//전체 출력하기
		System.out.println( m3.get("홍길동"));
		System.out.println( m3.get("이순신"));
		
		//생각 전체 출력하려면 key를 반복해서 넣어 주면 된다
		//keySet() 모든 키를 Set() 담는다
		Set<String> m3Keys = m3.keySet(); //키들을 담는다
	
		Iterator<String> it = m3Keys.iterator();
		while ( it.hasNext() ) {
			// System.out.println( it.next() );//키값들이 반복해서 출력
			System.out.println( m3.get(   it.next()       ) + "###");
		}
		
	}

}