
public class OuterClassOverridingInnerClass {
	
	private int outer_member_filed;
	public void outer_member_method() {
		System.out.println("OuterClassOverridingInnerclass.outer_member_method()");
		
	}
	
	/******************* member inner class[CASE1] ******************************/
	public void outer_inner_class_user() {
		ChildParentFirstConcreteClass childParentFirstConcreteClass=new ChildParentFirstConcreteClass();
		ChildParentSecondAbstractClass childParentSecondAbstractClass=new ChildParentSecondAbstractClass();
		ChildParentThirdInterface childParentThirdInterface=new ChildParentThirdInterface();
		childParentFirstConcreteClass.method();
		childParentSecondAbstractClass.method();
		childParentThirdInterface.method();
		
		
	/******************* anoonymouse local inner class[CASE2] ******************************/
		/*
		 * 특정클래스의 메쏘드를 재정의해야할때
		 * 1. local위치에 이름이없는 클래스정의
		 * 2. 이름이없는 객체를생성
		 */
		
		ParentFirstConcreteClass childParentFirstConcreteClass2 = new ParentFirstConcreteClass() {
			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass를 상속받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
			}
		};
		
		childParentFirstConcreteClass2.method();
		ParentSecondAbstarctClass childParentSecondAbstractClass2 = new ParentSecondAbstarctClass() {
			
			@Override
			public void method() {
				System.out.println("ParentSecondAbstarctClass를 상속받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
				
			}
		};
		childParentSecondAbstractClass2.method();
		
		ParentThirdInterface childParentThirdInterface2 = new ParentThirdInterface() {
			
			@Override
			public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
				
			}
		};
		
		childParentThirdInterface2.method();
		
		
		Object objectChild = new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "난재정의한 메쏘드";
			}
		};
		System.out.println(objectChild.toString());
		
		
	}
	
	public static void main(String[] args) {
		OuterClassOverridingInnerClass outerClass = new OuterClassOverridingInnerClass();
		outerClass.outer_inner_class_user();
	}
	
	
	/******************* member inner class ******************************/
	public class ChildParentFirstConcreteClass extends ParentFirstConcreteClass{
		@Override
		public void method() {
			System.out.println("ParentFirstConcreteClass를 상속받는 "
					+ "ChildParentFirstConcreteClass에서 재정의한 method()");
		}
	}
	public class ChildParentSecondAbstractClass extends ParentSecondAbstarctClass{
		@Override
		public void method() {
			System.out.println("ParentSecondAbstarctClass를 상속받는 "
					+ "ChildParentSecondAbstractClass에서 재정의한 method()");
		}
		
	}
	public class ChildParentThirdInterface implements ParentThirdInterface{
		@Override
		public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 "
						+ "ChildParentThirdInterface에서 재정의한 method()");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
