
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별
		 */
		int num = 23;
		
		switch (num%2) {
		case 0:
			System.out.println("짝수");
			break;

		case 1:
			System.out.println("홀수");
			break;
		}
		
		/*
		 * 1~6사이의 정수발생
		 */
		int diceNo =(int)( Math.random()*6 ) +1;
		System.out.println(diceNo);
		
		switch(diceNo){
		case 1:
			System.out.println("dice number : " + diceNo);
			break; 
		case 2:
			System.out.println("dice number : " + diceNo);
			break;
		case 3:
			System.out.println("dice number : " + diceNo);
			break;
		case 4:
			System.out.println("dice number : " + diceNo);
			break;
		case 5:
			System.out.println("dice number : " + diceNo);
			break;	
		case 6:
			System.out.println("dice number : " + diceNo);
			break;
		}
		/*
		 * 입력되는 키보드문자열에 따라 게임캐릭터 이동
		 */
		char direction = 'a';
		
		switch (direction) {
		case 'A' :
		case 'a' :
			System.out.println("move left~");
			break;
		case 'W':
		case 'w':
			System.out.println("move up~");			
			break;
		case 'D':
		case 'd':
			System.out.println("move right~");			
			break;
		case 'X':
		case 'x':
			System.out.println("move down~");			
			break;	
		case 'S':
		case 's':
			System.out.println("move rotate~");			
			break;
		default :
			System.err.println("don't move");
			break;
		}
	
	
	}

}
