package ch07.sec06;

import ch07.sec07.A;

public class D extends A{
	
	public D() {
		super();
	}
	
	public void method1() {
		this.field="value"; //�ٸ� ��Ű���� �ִ� AŬ������ �θ��� �ʵ带 �� �� �ִ�.
		this.method();
	}
//	public void method() {
//	A a=new A();
//	a.field = "value";
//	a.method();
//	}
}
	
