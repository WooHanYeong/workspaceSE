
public class AbcMain {

	public static void main(String[] args) {
	
		Abc abc1 =new Abc();
		Abc abc2 =new Abc();
		Abc abc3=new Abc();
		
			
		abc1.aa("우한영",true,3);
		abc2.bb("한영우",false,6);
		abc3.cc("영한우",true,9);
		
	
		abc1.print();
		abc2.print();
		abc3.print();

		
		System.out.println("-------------------");
		
		Abc aabb = new Abc();
		aabb.setaa(1,2);
		
		aabb.print();
	}

}
