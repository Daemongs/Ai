package ch06.sec02;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10*10* Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		int result4 = Calculator.multiply(10, 5);
		int result5 = Calculator.devide(10, 5);


		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		
	}

}
