package ch08.sec03;

public interface CarExample {
	
	public static void main(String[] args) {
		
		CarRun carRun = new CarRun();
		
		Bus bus = new Bus();
		carRun.drive(bus);
		
		Taxi taxi = new Taxi();
		carRun.drive(taxi);
		
		Train train = new Train();
		carRun.drive(train);
		
	}

}
