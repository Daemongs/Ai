package ch09.sec05;

public class AnyEx {

	public static void main(String[] args ) {
		
		AA aa = new AA(); //
		aa.iaM();
		
		// �ڽ��̸� ���� �ڽ�Ŭ���� ��üȭ
		A a = new A() {
			@Override
			void iaM() {
				System.out.println("�̸����� �ڽ�Ŭ���� ���� �θ�üȭ�� {}�ְ� �ٷ� �ڽ� Ŭ���� ����")
			}
			
		};
		a.iaM()''
	}
	
	
}

class A


