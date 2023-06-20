import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain2 {

	public static void main(String[] args) {

		try {
			
		
		System.out.println("stmt1");
		String str = "";
		int length=str.length();
		System.out.println("length:" + length);
		System.out.println("stmt2");
		int[] intArray = null;
		intArray = new int[3];
		intArray[3] = 9999;
		System.out.println("stmt3");
		
		
		}catch(NullPointerException e) {
			System.out.println("----------catch start[NullPointerException]");
			System.out.println("NullPointerException msg : "+ e.getMessage());
			System.out.println("----------catch end[NullPointerException]");
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("----------catch start[ArrayIndexOutOfBoundsException]");
			System.out.println("ArrayIndexOutOfBoundsException msg : "+e.getMessage());
			System.out.println("----------catch end[ArrayIndexOutOfBoundsException]");
			
		}

		
		
	}

}