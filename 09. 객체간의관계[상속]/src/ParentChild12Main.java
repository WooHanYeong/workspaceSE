
public class ParentChild12Main {

	public static void main(String[] args) {
		
		System.out.println("--------------child1---------------");
		Child1 ch1 = new Child1();
		ch1.member1 =1;
		ch1.member2 =2;
		ch1.member3 =3;
		ch1.member4 =4;
		ch1.method1();
		ch1.method2();
		ch1.method3();
		ch1.method4();
		
		System.out.println("--------------child2---------------");
		Child2 ch2 = new Child2();
		ch2.member1 =1;
		ch2.member2 =2;
		ch2.member5 =3;
		ch2.method1();
		ch2.method2();
		ch2.method5();
		/*
		System.out.println("----------Parent-------------");
		Parent p = new Parent();
		p.member1=1;
		p.member2=2;
		p.method1();
		p.method2();
		*/
		
	}

}
