package ch07.sec07;

public class Person {

	String name;
	int age;
	final static int max=100;
	
	public final void eat() {
		System.out.println("ÀÏ¹Ý ¹äÀ» ¸Ô´Â´Ù.");
//		max = max-50;
	}
	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	
}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}