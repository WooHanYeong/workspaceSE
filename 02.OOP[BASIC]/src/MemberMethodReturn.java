
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 * 	-멤버필드선언시 값을 대입할 수 있다.
	 */
	int memberField1=10;
	int memberField2=20;
	int memberField3=30;
	
	/*
	 * 멤버메쏘드
	 */
	int method1() {
		System.out.println("\t ----method1실행");
		int result = 1+2;
		System.out.println("\t ----method1실행종료후 "
		+ "실행흐름과 int 데이터 반환");
		/*
		 * return <호출한 클래스(객체)에게 반환할값>
		 * (변수,리터럴,연산의결과)
		 * -호출한곳으로 실행흐름반환
		 * -호출한곳으로 테이터반환
		 * -반환할데이터가 없는경우(void) return 문 생략가능.
		 * -반환할데이터가 있는경우(int . ...) return 기술.
		 * 
		 */
		return result;
	}
	
	boolean  method2() {
		System.out.println("\t ----boolean method2실행");
		boolean isMarried = false;
		System.out.println("\t ----boolean method2실행후 "
		+ "boolean데이타+데이터 반환");
		return isMarried;
	}
	/*
	 * 두개의정수를 파라메타로 받아서 더한결과를 (정수)로 반환하는 메쏘드.
	 */
	int add(int a,int b) {
		System.out.println("---int add(int a,int b)--- 실행");
		int result = a+b;
		System.out.println("---int add(int a,int b)--- 종료 후 데이터 반환");
		return result;
	}
	
	/*
	 * 이름을 매개변수로 이력받아서 인사말을 만들어서 문자열로 반환하는 메쏘드.
	 */
	String hello(String name) {
		String msg = name + " 님 안녕하세요.!!";
		return msg;
		
	}
	
	
	
} //end
