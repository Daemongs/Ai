package ch12.sec05;

import java.util.Properties;

public class PropertiessEx {

	public static void main(String[] args) throws Exception{
		
		java.util.Properties properties = new Properties();
		properties.load(PropertiessEx.class.getResourceAsStream("database.properties"));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		
		
		System.out.println("drvier : " +driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);				
		System.out.println("password : " + password);
		System.out.println("admin : " +admin);
		// TODO Auto-generated method stub

	}

}
