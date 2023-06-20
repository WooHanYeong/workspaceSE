/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개의 모음타입 
      - 배열타입변수의 선언형식
           데이타타입[] 이름;  ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		
		int intType;
		intType = 90;
		
		
		int[] intArray; // int 배열타입
		intArray = new int[5];
		System.out.println("intArray의 주소값 : " +intArray);
		intArray[0] = 45; //접근하면 int타입
		intArray[1] = 78;
		intArray[2] = 56;
		intArray[3] = 99;
		intArray[4] = 21;
		
		System.out.println("----------출력------------");
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		/*
		 * 모둔배열의객체는 public int length; 를 멤버변수로 가진다
		 */
		System.out.println("배열객체의멤버필드객수 : " + intArray.length);
		
		System.out.println("----------출력 for문------------");
		for(int i=0;i<5;i++) {
			System.out.println("intArray["+i+"]의 값 : "+intArray[i]);
		}
		
		System.out.println("----------기본형 1차원배열------------");
		System.out.println("----------int[]------------");
		int[] korArray = new int[10];
		korArray[0]= 89;
		korArray[1]= 34;
		korArray[2]= 45;
		korArray[3]= 56;
		korArray[4]= 67;
		korArray[5]= 78;
		korArray[6]= 91;
		korArray[7]= 32;
		korArray[8]= 100;
		korArray[9]= 63;
		
		int korTot = 0;
		for(int i=0;i<korArray.length;i++) {
			korTot+=korArray[i];
		}
		System.out.println("총점 : " + korTot);
		System.out.println("평균 : " + (double)korTot/korArray.length);
		
		System.out.println("-------------char[]-----------------------");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'e';
		ca[2] = 'l';
		ca[3] = 'l';
		ca[4] = 'o';
		ca[5] = '!';
		
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		
		System.out.println("-------------boolean[]-----------------------");
		boolean[] ba=new boolean[5];
		ba[0]=true;
		ba[1]=true;
		ba[2]=false;
		ba[3]=false;
		ba[4]=true;
		
		
		int truecount =0;
		for (int i = 0; i < ba.length; i++) {
			if (ba[i]==true) {
				truecount ++ ;
			
			}
		}
		System.out.println("true : " +truecount);
		System.out.println("false : " + (ba.length-truecount));
		
		System.out.println("-------------String[]-----------------------");
		String[] strArray = new String[5];
		strArray[0] = "KIM";
		strArray[1] = "WOO";
		strArray[2] = "HAN";
		strArray[3] = "YEONG";
		strArray[4] = "JOO";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	}

}