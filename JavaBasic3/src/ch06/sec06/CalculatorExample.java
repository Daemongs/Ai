package ch06.sec06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
	
		calculator.powerOn();
		calculator.poweroff();
		
		calculator.powerOn();
		int result = calculator.plus(300, 50);
		System.out.println(result);
		
		result = calculator.plus(-50, -100);
		System.out.println(result);
	
		// 문제 100,200,300 더하기
		// A사람은 2번 호출
		result = calculator.plus(100,200);
		result = calculator.plus(result,300);
		
	}
	
}
