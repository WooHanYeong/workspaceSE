/* OOP의 클래스설계 방법
 *   1. 캡슐화 (Encapsulation)
 *   2. 상속성 
 *   3. 다형성(오버로딩,오바라이딩,객체형변환)
 */

/*
 * 1. 캡슐화 (Encapsulation)
 *    - 외부클래스(객체)에서 멤버변수에 접근을 막고
 *      멤버 메쏘드에만 접근할수있도록 클래스를 설계하는방법
 *    - 구현 : 멤버변수 의 접근제한자를 private 
 *    		   멤버메쏘드 의 접근제한자는 public 으로한다. 
 *             public ==> 어떤 외부클래스(객체) 에서든지 접근가능 // 어떤 메인클래스에서든지 접근가능.
 *             private==> 어떤 외부클래스(객체) 에서든지 접근불가능// 어떤 메인클래스에서든지 접근불가능.
 */

public class Encapsulation {
	private int memberField1;
	private boolean memberField2;
	private char memberField3;
	private double memberField4;
	
	//setter 메쏘드
	
	public void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}

	public void setMemberField2(boolean memberField2) {
		this.memberField2 = memberField2;
	}

	public void setMemberField3(char memberField3) {
		this.memberField3 = memberField3;
	}

	public void setMemberField4(double memberField4) {
		this.memberField4 = memberField4;
	}	
		
	// getter 메쏘드
	
	public int getMemberField1() {
		return this.memberField1;
	}

	public boolean getMemberField2() {
		return memberField2;
	}

	public char getMemberField3() {
		return memberField3;
	}

	public double getMemberField4() {
		return memberField4;
	}
	
	public void print() {
		System.out.println(this.memberField1+"\t"
						+this.memberField2+"\t"
						+this.memberField3+"\t"
						+this.memberField4);
		
	}
		
}

