
public class MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("-- main start --");
		
		/*
		 * MemberField 사용자정의타입 객체의 주소값을 
		 * 저장할 참조변수 선언.
		 */
		MemberField mf1;
		/*
		 * MemberField클래스(틀)로 객체생성 후에 객체의
		 * 주소값이 mf1참조변수에 대입(#100)
		 */
		mf1 = new MemberField();
		/*
		 *mf1(#100)주소에 있는 객체의 int타입의     멤버필드 MemberField1에 1321값을 대입. 
		 *mf1(#100)주소에 있는 객체의 double타입의  멤버필드 MemberField2에 3.2값을 대입. 
		 *mf1(#100)주소에 있는 객체의 boolean타입의 멤버필드 MemberField3에 true값을 대입. 
		 *mf1(#100)주소에 있는 객체의 char타입의    멤버필드 MemberField4에 'A'값을 대입. 
		 *mf1(#100)주소에 있는 객체의 String타입의  멤버필드 MemberField5에 ~값을 대입. 
		 *
		 *   
		 *   
		 *   -객체의 참조 (주소)변수가 가지고있는 객체의 주소값 #100를 사용해서
		 *   MemberField에 데이터를 대입.
		 *   
		 *   -객체의멤버필드 접근방법 
		 *   - 참조(주소)변수.멤버필드이름 = 값;
		 *   - mf1.member1=77;
		 */
		
		
		mf1.memberField1=1321;
		mf1.memberField2=3.2;
		mf1.memberField3=true;
		mf1.memberField4='A';
		mf1.memberField5="김수한무거북이와두루미~~";

		
		MemberField mf2 = new MemberField();
		
		mf2.memberField1= 324234;
		mf2.memberField2= 3.14159;
		mf2.memberField3= false;
		mf2.memberField4= '가';
		mf2.memberField5= "제임스딘";
		
		/*
		 mf1객체의 int    타입의    멤버필드 memberFiled1의 값을 출력.
		 mf1객체의 double 타입의    멤버필드 MemberField2의 값을 출력.
		 mf1객체의 boolean타입의    멤버필드 MemberField3의 값을 출력.
		 mf1객체의 int 타입멤버필드 memberFiled4의 값을 출력.
		 mf1객체의 int 타입멤버필드 memberFiled5의 값을 출력.
		 
		 -객체의 참조(주소)변수가 가지고있는 객체의 주소값 #100를 사용해서 멤버필드의 값을 출력
		 -객체의 멤버필드 접근방법
		 	1.System.out.println(mf1.memberField1);
		 	2. int tempMember1 = mf.memberField1;
		 	   System.out.println(tempMember1);
		 */
		
		System.out.println("mf1의 주소값 : "+mf1);
		System.out.println(mf1.memberField1+ " "+ mf1.memberField2+ " "+ mf1.memberField3+ " "
				+ mf1.memberField4+ " " + mf1.memberField5+ " ");
		int tempMember1 = mf1.memberField1;
	 	System.out.println(tempMember1);
		System.out.println(mf2.memberField1+ " "+ mf2.memberField2+ " "+ mf2.memberField3+ " "
				+ mf2.memberField4+ " " + mf2.memberField5+ " ");
		System.out.println("-- main end --");

	}
}
