package ch06.sec06;

public class Calculator {

	// �޼ҵ� ����~�Ѵ�, ~�ϱ� ����. ���ڱ�. ���. ����ϱ�
	// ���� [ ���������� ] ����Ÿ�� �޼ҵ��([�Ű����� ...]){  }
	// ���Ŀ��� [  ] ��������, ... �� ������
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void poweroff() {
		System.out.println("������ ���ϴ�.");
	
	}
	
	int plus(int x, int y) {
		int result = x+y ;
		return result;  // return�� �޼ҵ带 ȣ���� ���� �ǵ��� �޶�� ��
	}
	
	
	double divide (int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	
	
	
	
}
