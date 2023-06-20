
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("-------------Reference Variable Assign-------------");
		Account account1 =new Account(2341,"김아론",90000,3.6);
		Account account2 =account1;
		Account account3 = new Account(8989,"김경록",890000,5.6);
				
		System.out.println("account1주소"+account1);
		System.out.println("account2주소"+account2);
		account1.print();
		account2.print();
		account1.setOwner("김야론");
		account1.print();
		account2.print();

		System.out.println("-------------Reference Variable Compare ( ==, != )-------------");
		if(account1 ==account2) {
			System.out.println("주소값이 동일하다 "+account1+"=="+account2);
		}
		
		if(account1 != account3) {
			System.out.println("주소값이 동일안하다 "+account1+"=="+account3);
		}
		
		System.out.println("-------------Reference Variable swap-------------");
		Account a1 =new Account(1000,"일천님",30000,3.0);
		Account a2 =new Account(2000,"이천님",80000,2.0);
		System.out.println("Swap전");
		a1.print();
		a2.print();
		
		Account tempAccount =a2;
		a2=a1;
		a1=tempAccount;
		
		System.out.println("Swap후");
		a1.print();
		a2.print();
		
		System.out.println("-----------------Reference Variavle null value--------------");
		/*
		 * null:객체주소 리터럴값
		 * 	- 객체주소초기화의 용도로 사용
		 *	- null주소사용시 NullPointerException 이발생
		*/
		
		Account a = null;
		if(a==null) {
			a=new Account(9090,"구공",5600, 3.0);
		}
		a.print();
		
		
		
	}

}
