package bytestream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;


public class PrintStreamMain {
	public static void main(String[] args) throws Exception {
		PrintStream pout=new PrintStream(new FileOutputStream("printStream.txt"));
		
		pout.print(1234);
		pout.print('김');
		pout.print(true);
		pout.print(1.1415192);
		
		pout.print("\n");
		
		pout.print("1234");
		pout.print("김");
		pout.print("true");
		pout.print("1.1415192");
		
		System.out.println("------------PrintStream.print()");
		
		
		
		
		
		
		
	}
}