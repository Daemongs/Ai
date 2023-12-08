package ch06.sec06;

public class 생성자연습 {

	
	String name;
	int score;
	
	
	public 생성자연습(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public 생성자연습() {
		this (5,false);//다른생성자 호출
		name="김유신";
		// TODO Auto-generated constructor stub
	}

	public 생성자연습(int i, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public 생성자연습(boolean b, int i) {
		// TODO Auto-generated constructor stub
	}

	public 생성자연습(boolean b) {
		// TODO Auto-generated constructor stub
	}
	

	
	//생성자가 1개도 없으면 "생성자연습()" 자바 컴파일러 자동으로 만듬
	
	
	
}
