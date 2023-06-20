	/*	System.out.println("------------String객체 내용비교는 반드시 equals메쏘드를 사용하여야합니다---------");
		/*
		  << public boolean equals(String otherString) >>
			- 스트링객체의 문자열과 otherString객체의 문자열이 같은지비교해서
			  true(같은경우),false(다른경우) 를 반환한다.
		 
		
		String name1="KIM";
		String name2="KIM";
		String name3="LIM";
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이동일하다.");
		}
		if(!name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이동일하지않다.");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과  \"KIM\" 객체의 문자열이동일하다.");
		}
		if(!name1.equals("SIM")) {
			System.out.println("name1객체의 문자열과  \"SIM\" 객체의 문자열이동일하지않다.");
		}
		*/
		 
		 
package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		
		/*
		 * String객체의생성
		 * 1. 생성자호출(명시적)
		 * 2. "" 으로생성(암시적)
		 * 
		 */
		
		String name1 = new String ("KIM");
		String name2 = new String ("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		
		System.out.println("String 객체의내용비교는 반드시 equals 메쏘드를사용하여야합니다.");
		
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2의 문자열이 동일하다");
		}
		if(name1.equals(name3)) {
			
			System.out.println("name1객체의 문자열과 name3의 문자열이 동일하다");
		}
		if(name1.equals(name4)) {
			System.out.println("name1객체의 문자열과 name4의 문자열이 동일하다");
			
		}
		
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과 KIM의 문자열이 동일하다");
			
		}
		
		int unicodeGap = "aaa".compareTo("aaa");
		System.out.println(unicodeGap);
		int unicodeGap2 = "aaa".compareTo("ddd");
		System.out.println(unicodeGap2);
		
		
		String name11 = "김경호";
		String name22= "홍경호";
		if(name11.compareTo(name22)<0) {
			System.out.println(11);
		}
		
		
		
		
		
	}
}
