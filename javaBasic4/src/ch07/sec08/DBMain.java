package ch07.sec08;

public class DBMain {

	public static void main(String[] args) {
		
		// 오라클DB
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
	//부모 타입의 필드를 선언
	DB db;
	
	public void dbRun() {
		db.runDB();
	}
	
}