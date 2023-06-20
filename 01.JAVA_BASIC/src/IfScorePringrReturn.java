
public class IfScorePringrReturn {

	public static void main(String[] args) {
		/*
		 * 점수유효성체크
		 */
		int kor = -90;
		if(!(kor>=0 && kor<=100)) {
			//유효하지않은점수
			System.out.println(kor + "은 유효한 점수가 아닙니다." );	
			return;
		}
		/********유효한 점수********/
		/*
		 * 학점계산
		 */
		char hakjum = 'F';
		if (kor>=90) {
			hakjum = 'A';
		}else if (kor>=80) {
			hakjum='B';
		}else if (kor>=70) {
			hakjum='C';
		}else if (kor>=60) {
			hakjum='D';
		}else {
			hakjum='F';
		}
		System.out.println("학점은 " + hakjum + " 입니다.");
		/*
		 * 학점계산
		 */
		return;
		
		
	}

}
