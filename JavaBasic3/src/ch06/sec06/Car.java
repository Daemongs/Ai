package ch06.sec06;

public class Car {

	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	boolean start;
	int speed;
	
	public Car() {
	this("�����ڵ���","�ҳ�Ÿ");	
	}
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		
		super();
		this.company = company;
		this.model = model;
		this.color=color;
		this.maxSpeed = maxSpeed;
		this.speed=speed;
	}

	public void setCompany(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setModel(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setMaxSpeed(int i) {
		// TODO Auto-generated method stub
		
	}

	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCompany() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMaxSpeed() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	
	
