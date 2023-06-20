package President.korea;

import President.america.Trump;

public class YS {
	
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	
	public void method1() {
		System.out.println("YS.mehtod1()");
	}
	protected void method2() {
		System.out.println("YS.mehtod1()");
	}
	void method3() {
		System.out.println("YS.mehtod1()");
	}
	private void method4() {
		System.out.println("YS.mehtod1()");
	}
	
	public void access() {
		/***********************YS와 같은패키지의 클래스멤버접근*****************************/
		DJ dj =new DJ();
		dj.member1=1;
		dj.member2=2;
		dj.member3=3;
		//dj.member4=4; private.
		

		/***********************YS와 다른패키지의 클래스멤버접근*****************************/
		Trump trump = new Trump();
		trump.member1=1;
		trump.method1();
		/*
		trump.member2=2;
		trump.member3=3;
		trump.member4=4;
		 
		trump.method2();
		trump.method3();
		trump.method4();
		 */
		
		
		
	}
	
	
}
