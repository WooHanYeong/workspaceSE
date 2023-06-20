
public class OperatoerArithmatic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result =0;
		
		result = a + b;
		System.out.println("a+b --> "+ result);
		result = a - b;
		System.out.println("a-b --> "+ result);
		result = a * b;
		System.out.println("a*b --> "+ result);
		result = a / b; // ???
		System.out.println("a/b --> "+ result);
		
		/*
		 * 나머지 연산자  
		 * %
		 */
		
		result = a%b;
		System.out.println("a%b --> " + result);
		
		int number = 16;
		result = number%4;
		System.out.println("result변수의값이 0 이면 4의 배수 :" +result);
		
		int year = 2023;
		result = year%4; // 0,1,2,3
		System.out.println("2023/4 --> "+ result);
		result = year%100;
		System.out.println("2023/100 --> "+ result);
		result = year%400;
		System.out.println("2023/400 --> "+ result);
		
		
		
		/*
		 * 비트연산자
		 * << , >>
		 */
		int i = 1;
		System.out.println("----------------->>,<<---비트연산자---------");
		System.out.println(i);
		result = i << 1;
		System.out.println(result);
		result = i << 2;
		System.out.println(result);
		result = i << 3;
		System.out.println(result);
		result = i << 4;
		System.out.println(result);
		
		System.out.println("----------------문자연산-------------");
		char ca = 'A';
		char cz = 'Z';
		
		int numberOfAlphabet = cz-ca+1;
		System.out.println(" 알파벳 대문자수 "+numberOfAlphabet);
		int numberOfhangul = '힣'-'가'+1;
		System.out.println(" 한글 글자수: "+ numberOfhangul);
	
		char  hangul1 ='가';
		System.out.println(hangul1);
		char  hangul2 ='가'+1;
		System.out.println(hangul2);

		
	
	}
}
