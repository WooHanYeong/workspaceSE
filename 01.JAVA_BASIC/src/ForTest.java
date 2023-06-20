import java.util.Iterator;

/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
		       	//1.반복변수(선언,초기화가능)
		       	//2.반복변수의 조건검사(논리형데이타)
		       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/

public class ForTest {

	public static void main(String[] args) {
		System.out.println("-------------------while-----------------");
			int k=0;       
			while (k<10) {
				System.out.println("k : "+k);
				k++;
			}
		System.out.println("-------------------for i 증가-----------------");
		for(int i =0; i<10 ; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------for i 감소-----------------");
		for(int i =10; i>0 ; i--) {
			System.out.println(i);
		}
		System.out.println(">>홀수만출력[1~100");
		for (int i=1 ; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(">>4의배수만출력[1~100");
		for (int i=1 ; i<=100; i++) {
			if(i%4==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println(">>3과4의 공통배수[1~100");
		for (int i=1 ; i<=100; i++) {
			if((i%4==0)&&(i%3==0)) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();

		
		System.out.println(">>3과4의 최소공배수[break]");
		for (int i=1 ; i<=100; i++) {
			if((i%4==0)&&(i%3==0)) {
				System.out.print(i + " ");
				break;
				/*
				 * break문
				 * 	1.반복문에서 사용
				 * 	2.break문 이후의 for블록코드를 실행하지 않는다.
				 * 	3.다음반복블록도 실행하지 않는다.
				 */
			}
		}
		
		System.out.println();
		System.out.println(">>4의배수가 아닌수출력[condinue]");
		for(int i = 1; i<=100; i++) {
			if (i%4==0) {
				/*
				 * 4의배수조건이 만족되면 continue문이 실행되고 현재실행중인 for블록의 continue문 이후코드를 실행한다.
				 */
				continue;
				/*
				 * 반복 블록에서만 사용가능
				 * continue문 이후의 for블록코드를 실행하지 않는다.
				 * 다음 반복을 계속 실핸한다(continue)
				 */
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println(">>홀수짝수합[1~100]");
		
		int oddTot =0;
		int evenTot =0;
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				evenTot+=i;
			}else {
				oddTot+=i;
			}
		}
		System.out.println("짝수합 : " + evenTot);
		System.out.println("홀수합 : " + oddTot);
		
		
		System.out.println("---------문자출력----------");
		
		for(char c='a'; c<='z' ;c++) {
			System.out.print(c);
			if(c=='z') {
				continue; //마지막 , 사라지게
			}
			System.out.print(",");
		}
		System.out.println();
		
		
		
		
	}//main end
}//class end
