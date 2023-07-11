package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Dao(Data Access Object) 클래스
 * 	 -  address 테이블에 CRUD(Create,Read,Update,Delete)작업을하는 
 *      단위메쏘드를 가지고있는 클래스	
 */
public class AddressDao1 {
	/*******데이타베이스 접속정보[182.237.126.19]**********/
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user = "jdeveloper13";
	private String password = "jdeveloper13";
	/*****************************************************/
	public void insert() throws Exception {
		String insertSql = "insert into address values(address_no_seq.nextval,'김경호','123-3456','경기도 포천시')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> insert row count:" + rowCount);
	}

	public void updateByPrimaryKey() throws Exception {

		String updateSql = "update address set name='김변경' ,phone='888-8888',address='서울시 강서구' where no = 1";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> update row count:" + rowCount);
	}

	public void deleteByPrimaryKey() throws Exception {

		String deleteSql = "delete from address where no=6";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> delete row count:" + rowCount);
	}

	public void findByPrimaryKey() throws Exception {

		String selectSql = "select no,name,phone,address from address where no=1";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		if (rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no + " " + name + " " + phone + " " + address);
		} else {
			System.out.println(">> 주소록 친구없다~~~");
		}
		rs.close();
		stmt.close();
		con.close();
	}

	public void findAll() throws Exception {

		String selectSql = "select no,name,phone,address from address order by no";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		if (rs.next()) {
			do {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				System.out.println(no + " " + name + " " + phone + " " + address);
			} while (rs.next());
		} else {
			System.out.println(">> 주소록 친구없다~~~");
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
