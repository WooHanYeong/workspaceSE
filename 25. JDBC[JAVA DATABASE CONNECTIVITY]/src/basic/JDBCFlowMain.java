package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowMain {

	public static void main(String[] args) throws Exception{
		/***********데이타베이스 접속정보[localhost]************
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:localhost:1521:xe";
		String user="scott";
		String password="tiger";
		********************************************************/
		/*******데이타베이스 접속정보[182.237.126.19]************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/*****************************************************/
		String selectSql="select deptno,dname,loc from dept";
		
		
		/*
		 * 1.Driver class loading
		 *   A.Driver Class객체생성
		 *   B.DriverManager에 드라이버객체등록
		 */
		Class.forName(driverClass);
		System.out.println("1.Driver class loading");
		/*
		 * 2.Connection객체생성
		 *   - DB Server와 연결객체
		 */
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.Connection객체생성:"+con);
		
		/*
		 * 3.Statement 객체생성
		 *   - SQL문 전송객체생성
		 */
		Statement stmt = con.createStatement();
		System.out.println("3.Statement객체생성:"+stmt);
		
		/*
		 * 4.SQL문 전송(select)
		 * 5.ResultSet객체얻기(select)
		 	 <<ResultSet객체>>
		 	 ----------------------------
		 	 DEPTNO  DNAME  	 LOC      
		 	 ----------------------------
  (cursor) ->BEFORE FIRST 영역	
		 	 10		ACCOUNTING	NEW YORK
			 20		RESEARCH	DALLAS
			 30		SALES		CHICAGO
			 40		OPERATIONS	BOSTON
			 AFTER LAST 영역	
		 * 
		 */
		ResultSet rs = stmt.executeQuery(selectSql);
		System.out.println("4,5.ResultSet객체얻기(select문실행결과):"+rs);
		System.out.println("----------------------------");
		System.out.println(" DEPTNO  DNAME  	 LOC    ");
		System.out.println("----------------------------");
		while(rs.next()) {
			int deptno=rs.getInt("deptno");
			String dname=rs.getString("dname");
			String loc=rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		System.out.println("----------------------------");
		/*
		 * 6.연결객체(resource해지) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6.연결객체(resource해지) close");
		
	}
}










