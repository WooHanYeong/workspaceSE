import javax.swing.JOptionPane;

public class RuntimeExceptionCatchMain3 {

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
		
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "고객님 ㅈㅅ");
			e.printStackTrace();
			
		}

		
		
	}

}