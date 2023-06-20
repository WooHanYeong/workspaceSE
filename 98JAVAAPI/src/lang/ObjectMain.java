package lang;

public class ObjectMain {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println(o2);
		
		if (o1.equals(o2)){
			System.out.println("o1과o2의 주소값이 동일하다[equals]");
		}else {
			System.out.println("o1과o2의 주소값이 다르다[equals]");
		}
	
		if (o1.equals(o3)){
			System.out.println("o1과o2의 주소값이 동일하다[equals]");
		}else {
			System.out.println("o1과o2의 주소값이 다르다[equals]");
		}
		
		
		
		if (o1==o2){
			System.out.println("o1과o2의 주소값이 동일하다[==]");
		}else {
			System.out.println("o1과o2의 주소값이 다르다[==]");
		}
	
		if (o1==o3){
			System.out.println("o1과o2의 주소값이 동일하다[==]");
		}else {
			System.out.println("o1과o2의 주소값이 다르다[==]");
		}
		
		System.out.println("----------ObjectChild----------");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		System.out.println("------재정의된equals------");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과oc3 주소는 동일하다");
		}else {
			System.out.println("oc1과oc3 주소는 동일하지않다");
		}
		
		System.out.println("---------재정의된toString---------");
		System.out.println(oc1.toString());
		System.out.println(oc2.toString());
		System.out.println(oc3.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
