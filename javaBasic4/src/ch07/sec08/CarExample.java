package ch07.sec08;

public class CarExample {

	public static void main(String[]args) {
		//Car 按眉 积己
		Car myCar=new Car();
		
		//Tire 按眉 厘馒
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 按眉 厘馒
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 按眉 厘馒
		myCar.tire = new KumhoTire();
		myCar.run(); 
	}
}
