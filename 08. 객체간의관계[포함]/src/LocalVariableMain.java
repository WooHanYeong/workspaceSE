
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local variable)
		 * 		-메쏘드블록안에서 선언된 변수(매개변수)
		 * 멤버변수(memeber field)
		 * 		-클라스블록안에 선언된 변수
		 */
		/*
		 * local변수 (기본형변수)
		 */
		int a = 9;
		int b = 10;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		/*
		 * 모든변수는 반드시 초기화해야 사용할수있다.
		 * <<The local variable tot may not have been initialized>>
		 *	int tot;
		 *	System.out.println("tot =" + tot);
		*/
		
		/*
		 * << The local variable tot may not have been initialized >>
		int tot;
		boolean condition = true;
		if(condition) {
			tot=0;
		}
		System.out.println(tot); 
		*/
		
		/*<< The local variable tot may not have been initialized >>
		int tot;
		tot=tot+1;
		*/
		
		int tot1;
		tot1 = 1;
		System.out.println("tot1 = " + tot1);
		
		int tot2;
		tot2=0;
		boolean condition = true;
		if (condition) {
			tot2=2;
		}
		System.out.println("tot2 = " + tot2);
		
		int tot3;
		tot3=0;
		tot3=tot3+3;
		System.out.println("tot3 = " +tot3);
		/*
		 * local변수 (참조형 변수)
		 */
		
		Order order1;
		order1 = new Order(1,"아이패드외3종","13-13",50000);
		order1.print();
		
		/*
		 * << The local variable tot may not have been initialized >>
		 */
		/*
		Order order2;
		boolean condition2 = true;
		if (condition2) {
			order2 = new Order(2,"바지외3종","2023-05-23",50000);
		}
		order2.print();
		*/
		
		Order order2;
		boolean condition2 = true;
		if (condition2) {
			order2 = new Order(2,"TV외3종","2023-05-26",1150000);
		}else {
			order2 = new Order(2,"바지외3종","2023-05-23",50000);
		}
		order2.print();
		
		/*
		 * 참조변수 초기화시 기본값
		 * 		-null (참조변수리터럴)
		 * 		-주소없다 주소값
		 */
		Order order3=null;
		if (order3 ==null) {
			order3=new Order(3,"시계","3-14",12312241);
		}
		order3.print();
	}


}

