package OOP;
class thread implements Runnable{
	public void run() {
		System.out.println("thred is running");
	}
}
public class ThredState {
public static void main (String[] args) throws InterruptedException {
	thread t1= new thread();
	Thread t2= new Thread(t1);
	
	displayStateAndIsAlive(t2);
	t2.start();
	displayStateAndIsAlive(t2);
	t2.sleep(1000);
	displayStateAndIsAlive(t2);
	
}

private static void displayStateAndIsAlive(Thread t2) {
	// TODO Auto-generated method stub
	System.out.println("state:"+t2.getState());
	System.out.println("isAlive:"+t2.isAlive());
	
}
}
