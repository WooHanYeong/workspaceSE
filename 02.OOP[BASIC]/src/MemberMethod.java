/*
 * 클래스의 구성요소
 *   1.멤버필드(변수)[속성]:객체생성시 속성데이타를 저장할변수
 *   2.멤버메쏘드
 */
public class MemberMethod {
	int member1;
	
	void method1(){
		System.out.println("\t-- void method1()실행시작 --- ");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t-- void method1()실행끝   --- ");
		return;
		/*
		 *  <<  return >>
		 *  -모든 메쏘드 블록의 마지막에는 항상 실행흐름을
		 *  호출한 곳으로 반환하여야한다.
		 *  
		 *  -실행흐름을 호출한곳으로 반환하는 문장이 return 문이다.
		 *  
		 * 	- return문을 만나면 실행흐름이 호출한곳으로 반환된다
		 * 
		 * 	-return type이 void인경우에는 생략이 가능한다.
		 * 
		 *  -return문이 생략된경우에는 컴파일러가 자동으로
		 *   return문을 삽입하여준다.
		 */
	}
	void method2(){
		System.out.println("\t-- void method2()실행시작 --- ");
		System.out.println("\t method2 stmt1");
		System.out.println("\t method2 stmt2");
		System.out.println("\t-- void method2()실행끝   --- ");
		return;
	}
	/*************매개변수(파라메타)가 있는 메쏘드**************/
	void method3(int count) {
		System.out.println("\t----void method3()---실행");
		int localVariable1 = 888;
		boolean localVariable2 = false;
		
		System.out.println("\t method3매쏘드블록안에서 선언된 로칼변수1"
		+localVariable1);
		System.out.println("\t method3매쏘드블록안에서 선언된 로칼변수2"
		+localVariable2);
		for (int i=0;i<count;i++) {
		System.out.println("\t void method3(int count)실행 :매개변수(파라메타)count값-->"+ count);
		}
		System.out.println("\t----void method3()---실행종료후 실행흐름 반환");
		return;
	}
	
	void method4(String msg , int count) {
		System.out.println("\t void method4(String msg , int count) --->실행");
		for(int i=0;i<count;i++) {
			System.out.println("\t\t"+msg);
		}
		System.out.println("\t void method4(String msg , int count) --->실행종료 후 실행흐름반환");
	}
	
	
} //main end
