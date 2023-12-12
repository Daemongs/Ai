package ch07.sec05;

public class 확인07Parent {
	public String nation;
	
	public 확인07Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public 확인07Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation call");
	}
}
