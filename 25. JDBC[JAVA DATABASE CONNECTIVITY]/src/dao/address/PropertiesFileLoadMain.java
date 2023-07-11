package dao.address;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileLoadMain {

	public static void main(String[] args) throws Exception {
	
	/*
	 * .properties 파일을 loading 해서 Properties객체를 만들어준다.
	 * 
	 */
	Properties properties = new Properties();
	
	//FileInputStream fis = new FileInputStream("C:\\2023-05-JAVA-DEVELOPER\\workspaceSE\\25. JDBC[JAVA DATABASE CONNECTIVITY]\\src\\application.properties");
	
	InputStream fis =PropertiesFileLoadMain.class.getResourceAsStream("/application.properties");
	
	
	properties.load(fis);
	System.out.println(properties);
	System.out.println("Properties size : " + properties.size());
	String username = properties.getProperty("username");
	String password =properties.getProperty("password");
	String contextpath =properties.getProperty("contextPath");
	String shopTitle =properties.getProperty("shop.title");
	System.out.println(username);
	System.out.println(password);
	System.out.println(contextpath);
	System.out.println(shopTitle);
	}

}
