package ch06.sec06;

public class Ȯ�ι���18 {
	
	public static void main(String[]args) {
		
		ShopService obj1 = ShopService.getInstance(); // static�� �ִ� �޼ҵ带 ȣ����
		ShopService obj2 = ShopService.getInstance();
				
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
		
		
		// ��Ʈ �̱��� �������� ShopService Ŭ������ ����� �ֽø� �˴ϴ�.
		// 1. �����ڴ� private�Դϴ�.
		// 2. �ʵ�� ��üȭ�ؼ� �������� �ּҸ� �����ϰ� private�մϴ�.
		// 3. �޼ҵ��� getInstance()���� ���ϰ��� �������� �ּ��Դϴ�. ���������ڴ� public�Դϴ�.
	}

}
