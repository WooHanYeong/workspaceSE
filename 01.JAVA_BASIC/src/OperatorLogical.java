
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		boolean result;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		// ( || ) < shift + \ 누르기
		
		System.out.println("=============논리합================");
		result = b1 || b2;
		System.out.println("true || true -->"+result);
		result = b1 || b3;
		System.out.println("true || false -->"+result);
		result = b3 || b1;
		System.out.println("false || true -->"+result);
		result = b3 || b4;
		System.out.println("false || false -->"+result);
		
		
		System.out.println("=============논리곱=================");
		result = b1 && b2;
		System.out.println("true && true -->"+result);
		result = b1 && b3;
		System.out.println("true && false -->"+result);
		result = b3 && b1;
		System.out.println("false && true -->"+result);
		result = b3 && b4;
		System.out.println("false && false -->"+result);
		
		/*
		 * 점수의 유효성체크. [0~100사이의 점수]
		 */
		System.out.println("=============유효성체크==========");
		int kor = 67;
		int eng = 90;
		
		boolean condition1 = kor >= 0;
		boolean condition2 = kor <= 100;
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수유효성체크 :" +isValidScore);
		
		boolean condition3 = kor >= 90;
		boolean condition4 = eng >= 90;
		
		System.out.println("A대학 국어점수가 90점 이상이거나 영어점수가 90점이상이면 합격");
		boolean isPass1 = condition3 || condition4;
		System.out.println("A대학 합격여부 : " + isPass1);
		
		System.out.println("A대학 국어점수가 90점 이상이고 영어점수가 90점이상이면 합격");
		boolean isPass2 = condition3 && condition4;
		System.out.println("B대학 합격여부 : " + isPass2);
		
		int math = 73;
		boolean isValidMathScore = ( math>=0 ) &&  (math >=100);
		System.out.println("수학점수의 유효성 여부 : " + isValidMathScore);
		
		boolean isValidMathScore11 = ( math<0 ) ||  (math >100);
		System.out.println("수학점수의 유효하지 않은지 여부 : " + isValidMathScore11);
		
		System.out.println("--------배수판별------");
		int number=12;
		boolean isMultiple3 = (number%3) == 0;
		System.out.println("3의배수여부:"+isMultiple3);
		boolean isMultiple4 = (number%4) == 0;
		System.out.println("4의배수여부:"+isMultiple4);
		boolean isMutiple34 = isMultiple3 && isMultiple4;
		System.out.println("3과4의 공통배수(공배수):"+isMutiple34);
		
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *    - 400의배수(400로나누어떨어지는수)
		 */
		int year = 2023;
		boolean isLeapYear = false;
		System.out.println(year+ "의 윤년여부 :" + isLeapYear);
		
		char c  = '김';
		
		boolean ishangul = c >='가' && c <='힣';
		System.out.println("한글여부 : "+ ishangul);
		
		/*
		 *아이디의 첫글자는 영문대문자이거나 소문자여야 한다. 
		 */
		char idFirstLetter = 'g';
		boolean isValidIdFirstLetter = true;
		System.out.println(idFirstLetter + "의 적합성 여부 : " + isValidIdFirstLetter);
		
	}

}
