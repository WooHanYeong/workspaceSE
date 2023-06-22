
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeLowerUpperPrintSharedObject sharedObject = new SynchronizeLowerUpperPrintSharedObject();
		
		//SynchronizeUpperThread upperThread = new SynchronizeUpperThread(sharedObject);
		SynchronizeLowerThread lowerThread1= new SynchronizeLowerThread(sharedObject);
		SynchronizeLowerThread lowerThread2 = new SynchronizeLowerThread(sharedObject);
		//upperThread.start();
		lowerThread1.start();
		lowerThread2.start();
	}

}
