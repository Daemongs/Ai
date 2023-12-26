package ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// Set 특징 : 중복된 요소를 제거한다. 중복저장되지 않는다.
		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(50);
		set.add(80);
		set.add(10);
		
		System.out.println( set.size() );
		
		//출력
		Iterator<Integer> it = set.iterator(); //반복자
		while ( it.hasNext() ) {
			System.out.println( it.next() );//순서없이 출력된다
		}
		
		// set안에 40이 있나요? 아니요
		System.out.println( set.contains(40) );
		
		// set안에 요소가 비어있나요? 아니요 650
		System.out.println( set.isEmpty() );
		
		// set안에 요소를 50을 지우세요.
		set.remove(50);
		
		//출력
		it = set.iterator(); //반복자
		while ( it.hasNext() ) {
			System.out.println( it.next() );//순서없이 출력된다
		}
		
		//set안에 요소 100 추가하기
		set.add(100);
		
		//set안에 요소 80 삭제하기
		set.remove(80);
		
		//출력하기
		it = set.iterator(); //반복자
		while ( it.hasNext() ) {
			System.out.println( it.next() );//순서없이 출력된다
		}
		
		
		
		
	}

}