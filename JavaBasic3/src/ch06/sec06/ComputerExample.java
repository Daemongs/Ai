package ch06.sec06;

public class ComputerExample {

	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		int result = computer.sum(1,2,3);
		System.out.println(result);
		
		result = computer.sum(1,2,3,4,5);
		System.out.println(result);
				
		result = computer.sum(1,2,3,4,5,6,7,8);
		System.out.println(result);
		
		double avgResult = computer.avg(1.1,2.2,3.3);
		System.out.println(avgResult);
		
		avgResult = computer.avg(11.1,22.2,33.3,44.4,55.5);
		System.out.println(avgResult);
			
		
	}
}
