import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class NotRIntimeExpectionThrowMain {

	public static void main(String[] args) throws Exception {
		/* UnknownHostException, IOException */
		try {
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IOException)
		 */
		Socket socket=new Socket("www.daum.net",80);
		System.out.println(socket);
		System.out.println("stmt2");
		
		Class.forName("AClass");
		/*
		 * 예외방생예상코드 ()
		 */
		int result=3/0;
		System.out.println("stmt3");	
		}catch (Exception e) {
			System.err.println("catch Exception msg:"+e.getMessage());
			JOptionPane.showMessageDialog(null, "애로사항발생:"+e.getMessage());
		}
		
	}

}
