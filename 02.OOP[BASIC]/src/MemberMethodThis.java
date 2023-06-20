
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	int memberField1;
	char memberField2;
	double memberField3;
	

	
	/*
	 * memberField1 의 값을 매개변수를 받아서 대입하는 메쏘드.
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 =  memberField1;
		/*
		 * this :
		 * 	- self참조변수
		 * 	- void setmemberField1() 메쏘드가 실행될때 호출주체객체의 주소값
		 *  - this는 생략이 가능하다
		 */
	}
	
	void setMemberField2(char memberField2) {
		this.memberField2 =  memberField2;
	}
	
	void setMemberField3(double memberField3) {
		this.memberField3 =  memberField3;
	}
	
	/*
	 * 1.객체의멤버필드에 데이터를 대입 
	 */
	void setMemberField(int memberField1, char memberField2, double memberField3) {
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
		
	}
	
	/*
	 * 2.객체의 멤버필드에 필드의 내용을 출력하는 메쏘드
	 * this 생략가능
	 */
	void print() {
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3+"\t");
	}
	
	
}//end
