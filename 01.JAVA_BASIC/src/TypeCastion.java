/*
	형변환--> 숫자형데이타간에만 가능
	    - 형식 :  (데이타타입)변수 or 리터럴;
	    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
		     byte-->short-->int-->long-->float-->double
	    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
		     double-->float-->long-->int-->short-->byte     
 */

public class TypeCastion {

	public static void main(String[] args) {
		
	/*
	 * 자동형변환
	 */
	
	System.out.println("----------자동형변환------------");
	int i1 =56;
	long l1 = i1;
	double d1=l1;
	System.out.println(i1);
	System.out.println(l1);
	System.out.println(d1);
	/*
	 * 강제형변환
	 */
	System.out.println("----------강제형변환------------");
	double avgd = 89.34;
	int avgi =(int)avgd;
	System.out.println("double avg :"+avgd);
	System.out.println("int avg :"+avgi);
	
	
	System.out.println("----------------------");
	char cc= '힣';
	int ci = cc;
	System.out.println("char c : " + cc);
	System.out.println("int c : " + ci);
	
	char cc2 = (char)ci;
	System.out.println("char c : " + cc2);
	System.out.println(" int --> char : " + (char)44230);
	/*
	 * 연산시의형변환
	 * 	-연산항들중 가장큰타입으로 모든항이 자동형변환된다.
	 */
	int ii=100;
	long ll = 234334;
	double dd= 3.14159;
	
	double result = ii+ll+dd;
	System.out.println(result);
	
	double dresult1 = 1.0/2;
	System.out.println(dresult1);
	double dresult2 = (double)1/2;
	System.out.println(dresult2);
	
	
	}

}


