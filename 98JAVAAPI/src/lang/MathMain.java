package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 *  	-수학계산함수를 가지고있는 클래스.
		 *  	-모든메쏘드 static
		 *  	-객체생성이불가능 (생성자 접근제한자 private)
		 *  	https://docs.oracle.com/javase/8/docs/api/index.html
		 *		
		 *		Math math = new Math();
		 *  	
		 */
		double r = Math.abs(-127.456);
		System.out.println(r);
		System.out.println(Math.max(999, 888));
		System.out.println(Math.min(999, 888));
		System.out.println((Math.round(33.55555*10))/10.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 9));
		System.out.println("----------math.random()------------");
		/*
		 * public static double random()
		 * Returns a double value with a positive sign, 
		 * greater than or equal to 0.0 and less than 1.0
		 */
		System.out.println("1~10 사이의 정수5개 생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);

		System.out.println("1~45 사이의 정수6개 생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		
	
		
		
		
		
		
	}

}
