public class VariableDeclar {
	
	public static void main(String[] args) {
		
		int score1; //변수선언
		score1 = 78; //변수에 값(정수)을 대입
		System.out.println(score1); //변수값을 출력	
		score1 = 89;
		System.out.println(score1);
		
		int score2 =90;
		System.out.println(score2);
		score2=99;
		System.out.println(score2);
		
		int _number=333;
		int $number=444;
		int 번호=555;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		
		int kor,eng,math;
		kor=90;
		eng=89;
		math=99;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		/*
		<< Duplicate local variable kor >> - 같은변수가 반복선언
		int kor=99;		
		
		<<history cannot be resolved to a variable>> 
		history=80;
		
		
		int 7up, my-score , your score 
		*/
		
		String name;
		name="김경호";
		System.out.println(name);
	}

}
