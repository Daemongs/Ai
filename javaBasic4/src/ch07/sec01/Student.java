package ch07.sec01;

//�ڽ� Ŭ���� = ����Ŭ���� 
public class Student extends Person {

	String dept; //����
	
	public void Study() {
		System.out.println("�����Ѵ�");
		
	}
	
	public Student() {
		System.out.println("�θ� Ŭ���� �ƹ��� Ŭ����");
	}
	
	public Student(String �̸�, int ����, String ����) {
		this.name = �̸�;
		this.age = ����;
		this.dept = ����;
		System.out.println("�θ� Ŭ���� �ƹ��� Ŭ���� ������ �ִ� ������ " + name);
	}
	
	
	
	
	
	
}
