package ch07.sec03;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.flyMode = SupersonicAirplane.ROUND;
		sa.fly(); // ȸ�� �����մϴ�.
		sa.flyMode = SupersonicAirplane.SLOW;
		sa.fly();
		sa.land();
		
	
	
	
	}
	
	
}
