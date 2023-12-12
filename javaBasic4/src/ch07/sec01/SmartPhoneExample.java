package ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		Phone p = new Phone();
		p.bell();
		
		p.sendVoice("�� ���!");
		p.receiveVoice("�� ��� �ʵ� �� ���?");

		SmartPhone sp = new SmartPhone();
		
		sp.sendVoice("���� ���Ұž�?");
		sp.receiveVoice("������ �����ؾߴ�");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("������","���");
		
		System.out.println(sp2.model);
		sp2.setWifi(true);
		if(sp2.wifi) {
			System.out.println(sp2.model+"�� �������̰� ����Ǿ����ϴ�");
		}else {
			System.out.println(sp2.color+" �������̸� ã�� �� �����ϴ�");
		}
		
		//�������� ����̰� ���� �︳�ϴ�
		System.out.print(sp2.model +"�� "+sp2.color+"�̰� ");
		sp.bell();
		
		//�������� �޽����� �Խ��ϴ�. "�ڱ�: �ڵ��� ���?"
		System.out.println(sp2.model+"�� �޼����� �Խ��ϴ� ");
		sp.sendVoice("�ڵ��� ������");
		
//		//�θ�Ŭ�������� �ڽ��� wifi �ʵ�, �޼ҵ� ����ϱ�
//		�θ�Ŭ���������� �ڽ��� ������� �� �� ����
		
//		p.wifi=true;
//		p.setWifi(true);
//		p.internet();
		

		
		
	}

}
