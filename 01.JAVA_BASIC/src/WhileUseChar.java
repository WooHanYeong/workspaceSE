
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 
		char c1=0;
		while (c1<65535) {
			System.out.print(c1);
			c1++;
			if(c1%100==0) {
				System.out.println();
			}
		}
		System.err.println();
		*/
		
		
		
		/*
		 * 영문 소문자출력
		 */
		char c2= 'a';
		int j = 0;
		while(c2<='z') {
			System.out.print(c2+" ");
			c2++;
			j++;
			if (j%5==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		/*
		 * 한글출력
		 */
		char han = '가';
		int k = 0;
		while(han<='힣') {
			System.out.print(han);
			han++;
			k++;
			if (k%100==0) {
				System.out.println();
			}
			
		}
		System.out.println();
		
		/*
		 * 숫자형문자
		 */
		char c3='0';
		while (c3<='9') {
			System.err.println(c3+ " ");
			c3++;
		}
		System.out.println();
		
		
		
	}

}
