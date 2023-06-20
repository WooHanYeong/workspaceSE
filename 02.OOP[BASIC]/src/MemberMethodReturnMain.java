
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		
		
	int returnData1 = mmr.method1();	
	System.out.println("main block-->returnData1 : "+returnData1);
	
	boolean returnData2 = mmr.method2();
	System.out.println("main block --> returnData2 : "
	+returnData2);
	
	int returnData3 = mmr.add(1234, 5678);
	
	System.out.println("main block -->returnData3 :" 	
	+returnData3);
	
	System.out.println("main block -->retirmData4 : "
	+mmr.add(1, 4));
	
	
	String returnData4 = mmr.hello("우한영");
	System.out.println(returnData4);
	System.out.println(mmr.hello("이효리"));
	System.out.println(mmr.hello("고소영"));
	System.out.println(mmr.hello("이소라"));
	

	}
}
