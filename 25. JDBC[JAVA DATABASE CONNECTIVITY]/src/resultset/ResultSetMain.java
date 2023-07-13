package resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import dao.common.DataSource;

public class ResultSetMain {
	
	public static void main(String[] args) throws Exception {
		String selectSql = "select no,name,short_desc,price,ipgo_date from product";	
		Connection con =new DataSource().getConnection();
		
		PreparedStatement pstmt= con.prepareStatement(selectSql);
		System.out.println("---------------ResultSet.get타입(컬럼이름)----------------");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date");
			/*String ipgoDateStr=
					new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date);*/
			
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
			
		System.out.println("---------------ResultSet.get타입(컬럼index)----------------");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int no = rs.getInt(1);
			String name = rs.getString(2);
			String short_desc = rs.getString(3);
			double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5);
			/*String ipgoDateStr=
					new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date);*/
			
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();	

		System.out.println("---------------ResultSet.getString(컬럼이름)----------------");
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String no = rs.getString("no");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			String price = rs.getString("price");
			String ipgo_date = rs.getString("ipgo_date");
			/*String ipgoDateStr=
					new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date);*/
			
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();

		System.out.println("---------------ResultSet.getObject(컬럼이름)----------------");
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Object no = rs.getObject("no");
			Object name = rs.getObject("name");
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date");
			/*String ipgoDateStr=
					new SimpleDateFormat("yyyy년 MM월 dd일").format(ipgo_date);*/
			
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
		}
		rs.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //end
}//end
