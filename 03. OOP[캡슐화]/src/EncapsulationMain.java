
public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation encapsulation 
					= new Encapsulation();
		
		/*
		 * encapsulation 객체멤버필드에 데이터 대입.
		 */
		
		/*
		encapsulation.memberField1=123;
		encapsulation.memberField2=true;
		encapsulation.memberField3='김';
		encapsulation.memberField4=1.3421;
		*/
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(false);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(1.3242);
		/*
		 * encapsulation 객체멤버필드에 데이터 출력.
		 */
		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		
		int tempMemberField1
				= encapsulation.getMemberField1();
		System.out.println(tempMemberField1);
		
		boolean tempMemberField2
				= encapsulation.getMemberField2();
		System.out.println(tempMemberField2);
	
		char tempMemberField3
				= encapsulation.getMemberField3();
		System.out.println(tempMemberField3);
		
		double tempMemberField4 
				= encapsulation.getMemberField4();
		System.out.println(tempMemberField4);
		
		encapsulation.print();
	}
	
}
