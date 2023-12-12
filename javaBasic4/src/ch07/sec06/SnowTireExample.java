package ch07.sec06;

public class SnowTireExample {
	public static void main(String[] arps) {
	SnowTire snowTire = new SnowTire();
	Tire tire = snowTire;
	
	snowTire.run();
	tire.run(); // 다형성 문제
	
	}
}
