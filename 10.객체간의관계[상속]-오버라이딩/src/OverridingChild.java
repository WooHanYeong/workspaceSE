
public class OverridingChild extends OverridingParent{
	/*
	 * 	public void method1() {
		System.out.println("OverridingParent.method1()");
	}	
	<<부모로부터 상속받은 자식메쏘드 method2>>
	-숨겨진다 (외부에서호출X)
	public void method2() {
		System.out.println("OverridingParent.method2()");
	} 상속
	 */ 
	
	/*
	 * <<자식에서 재정의한자식메쏘드 method2 >>
	 * 자식에서재정의한 메쏘드만 호출.
	 */
	@Override
	public void method2() {
		System.out.println("재정의된 method2");
		super.method2();
		/*
		 * super
		 * 	-this와 같은 self 참조변수
		 * 	-this와 같은 주소값이다
		 * 	-재정의에의해서 숨겨진 메쏘드(멤버)를 호출할때사용.
		 */
		System.out.println("OverridingParent.method2()");
		System.out.println("재정의된 method2");
	}
	
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
	
}
