
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 평점계산(A,B,C,D,F)
		 */
		int kor = 10;
		char hakjum = 'F';
		System.out.println("============ nested if =================");
		if (kor >= 90 && kor <= 100) {
			// A
			hakjum = 'A';
		} else {
			if (kor >= 80 && kor <= 90) {
				hakjum = 'B';
			} else {
				if (kor >= 70 && kor <= 80) {
					hakjum = 'C';
				} else {
					if (kor >= 60 && kor <= 70)
						hakjum = 'D';
				}
			}

		}

		System.out.printf("1.학점은 %c입니다.\n", hakjum);	
		System.out.println("================else if ================");
		
		hakjum = 'F';
		if (kor>=90 && kor <=100) {
			hakjum = 'A';
		}else if (kor>=80 && kor<90) {
			hakjum = 'B';
		}else if (kor>=70 && kor<80) {
			hakjum = 'c';
		}else if (kor>=60 && kor<70) {
			hakjum = 'D';
		}else {
			hakjum = 'F';
			
		}
		System.out.printf("1.학점은 %c입니다.\n", hakjum);	
		
	}

}
