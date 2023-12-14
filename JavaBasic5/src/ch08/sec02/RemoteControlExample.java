package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();


		RemoteControl rc2;
		rc2 = new SmartPhone();
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.turnOff();
		
		rc2.defaultM();
		RemoteControl.staticM();
}
	
}
