package ch11.sec02;

public class ExcepthionEx {

	public static void main(String[] args) {
		
		try {
			//���� �߻��� �� ���� �ڵ� ���� ����
			int a = 10;
			a = a/2;
			System.out.println(a );
			int[] iArr = {10,20,30};
			System.out.println(iArr[4]);

		} catch( ArithmeticException e  ) { //���ܸ� ����  
			System.out.println("�и� 0�̸� �ȵȴ�. ");
			//���� ���ܰ� �߻����� �� ó���ϴ� �ڵ� �ۼ�
		}
	}
}
