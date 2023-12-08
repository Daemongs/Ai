package ch06.sec05;

public class Singleton {

	private static Singleton singleton = new Singleton() ;
	
	private Singleton() {
		//������ new�ϸ� ����Ǵµ� private�ؼ�
		//�ܺλ����� ���ϰ� ��
	}
	
	public static Singleton getInstance() {
		return singleton;
		
	}
}
