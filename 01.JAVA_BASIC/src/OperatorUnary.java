
public class OperatorUnary {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br =  b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		
		int kor = 90;
		System.out.println("국어점수의유효성여부: "+ (kor>=0 && kor<=100));
		System.out.println("국어점수의유효성X여부: "+ !(kor>=0 && kor<=100));
		
		/*
		 * 증가,감소 연산자
		 * 	- 항은 반드시 변수이여야한다.
		 *  - 형태: ++,--
		 *  - 항변수의값을 정수1 만큼 증가(감소)시킨후 항변수에 대입 
 		 */
		System.out.println("-------------------[++i,--j]-------------");
		int i=5;
		int j=5;
		++i;// i=i+1;
		--j;// j=j-1;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("-------------------[i++,j--]-------------");
		i=5;
		j=5;
		i++;// i=i+1;
		j--;// j=j-1;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("-------------------[++i,j++]-------------");
		i=5;
		j=5;
		//System.out.println(++i);
		//System.out.println(j++);
		i=5;
		j=5;
		int ir= ++i;
		int jr= j++;		
				
		System.out.println(ir);
		System.out.println(jr);
		
		System.out.println(i);
		System.out.println(j);
		
		
	}

}


