package ch07.sec05;

public class Ȯ��07Child extends Parent {
	public String name;
	
	public Ȯ��07Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Ȯ��07Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}

}
