package ch07.sec01;

//�θ�Ŭ���� = ����Ŭ���� = ����Ŭ����
public class Person {
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("�Դ´�");
	}
	
	
	public void asleep() {
		System.out.println("�ܴ�");
	}
	
	
	public Person() {
		System.out.println("���� �ҸӴ� �θ� Ŭ�����Դϴ�.");
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	

}
