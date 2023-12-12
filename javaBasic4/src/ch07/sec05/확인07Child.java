package ch07.sec05;

public class 확인07Child extends Parent {
	public String name;
	
	public 확인07Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public 확인07Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
