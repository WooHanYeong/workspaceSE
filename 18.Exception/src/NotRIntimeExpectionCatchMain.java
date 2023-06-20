import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRIntimeExpectionCatchMain {

	public static void main(String[] args) throws Exception {
		/* UnknownHostException, IOException */
		
		System.out.println("stmt1");
		/*
		 * 예외발생예상코드(IOException)
		 */
		Socket socket=new Socket("www.daum.net",80);
		System.out.println(socket);
		System.out.println("stmt2");
		
		Class.forName("AClass");
		
		System.out.println("stmt3");

	}

}
