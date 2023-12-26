package ch11.sec02;

public class ExcepthionEx {

	public static void main(String[] args) {
		
		try {
			//예외 발생할 것 같은 코드 내용 감싼
			int a = 10;
			a = a/2;
			System.out.println(a );
			int[] iArr = {10,20,30};
			System.out.println(iArr[4]);

		} catch( ArithmeticException e  ) { //예외명 변수  
			System.out.println("분모가 0이면 안된다. ");
			//위에 예외가 발생했을 때 처리하는 코드 작성
		}
	}
}
