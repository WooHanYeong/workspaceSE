
public class SwitchTest {

	public static void main(String[] args) {
		int level = 4; // 게임레벨 1~5사이의 정수

		switch (level) {
		case 1:
			/*명령문위치*/
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			System.out.println("초보");
			/*
			 * break -----> switch block을 빠져나간다.
			 */
			break;
		case 2:
			System.out.println("중수");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("고수[3,4,5]");
			break;
		default:
			System.out.println("레벨은 1~5 사이의 정수입니다.");
		}
	}

}
