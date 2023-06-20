import javax.swing.JOptionPane;

public class RuntilmeExceptionCatchMain {

	public static void main(String[] args) {
		
		System.out.println("stmt1");
		String str1 = null;
		try {
			/*
			 * 예외발생예상코드
			 */
		int length = str1.length();
		System.out.println("length : " + length );
		
		} catch(NullPointerException exception) {
			System.out.println("-----catch start[NUllpointerException]---");
			String msg = exception.getMessage();
			str1 = "우한영";
			int length = str1.length();
			System.out.println("length : " + length );
			
			System.out.println("NullPointerException ==> meg : " +msg);
			System.out.println("-----catch end[NUllpointerException]---");
		}
		
		System.out.println("stmt2");
		try {
		int[] intArray = null;
		intArray = new int[3];
		intArray[3] = 9999;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("------catch start[ArrayIndexOutOfBoundsException]---");
			System.out.println("ArrayIndexOutOfBoundsException ==> msg" + e.getMessage());
			JOptionPane.showMessageDialog(null, "ArrayIndexOutOfBoundsException 예외발생");
			System.exit(0);
			System.out.println("------catch end[ArrayIndexOutOfBoundsException]---");
		}
		System.out.println("stmt2");
		
		
		
	}

}
