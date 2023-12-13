package ch07.sec08;

public class DBMain {

	public static void main(String[] args) {
		
		// ����ŬDB
		Connect myConnect = new Connect();
		myConnect.db = new Oracle();
		myConnect.dbRun();
		
		// MySQL
		myConnect.db = new MySQL();
		myConnect.dbRun();
		
		// MongDB
		myConnect.db = new MongoDB();
		myConnect.dbRun();
	}

}


class Connect{
	//�θ� Ÿ���� �ʵ带 ����
	DB db;
	
	public void dbRun() {
		db.runDB();
	}
	
}