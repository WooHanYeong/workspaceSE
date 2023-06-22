
public class ContorolSleepThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		System.out.println("2. main tehread 3일간 spleep");
		/*
		 * 현재 실행되고있는 
		 */
		
		Thread.sleep(3000);
		System.out.println("3.main theread sleep 깨어난 후 실행");
		
		ControlSleepThread cst = new ControlSleepThread();
		cst.setName("clock thread");
		cst.start();
		System.out.println("9.main jvm return");
	
	}
}
