
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main block start");
		MemberMethod mm1 = new MemberMethod();
		mm1.member1=123;
		System.out.println("main stmt1");
		/*
		 * 멤버메쏘드실행(호출)
		 * 	-형식 : 참조변수.메쏘드이름
		 * 	-main 실행흐름을 mm1주소에 있는객체의
		 *  method1이라는 이름의 메쏘드로 보낸다
		 */
		mm1.method1();
		System.out.println("main stmt2");		
		mm1.method2();
		System.out.println("main stmt3");		
		mm1.method3(3);
		System.out.println("main stmt4");
		mm1.method3(5);
		System.out.println("main stmt5");
		mm1.method4("안녕하세요", 3);
		System.out.println("main stmt6");
		mm1.method4("맛점", 10);
		System.out.println("main block end");
		return;
		
		
	}

}
