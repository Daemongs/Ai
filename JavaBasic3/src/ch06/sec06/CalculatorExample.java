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
	
		// ���� 100,200,300 ���ϱ�
		// A����� 2�� ȣ��
		result = calculator.plus(100,200);
		result = calculator.plus(result,300);
		
	}
	
}
