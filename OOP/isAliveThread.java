package OOP;

public class isAliveThread extends Thread {
	public void run() {
		System.out.println("geeks");
		try {
			Thread.sleep(300);
		}
catch(InterruptedException e) {
	
}
		System.out.println("for geeks");
	}
	public static void main(String[] args) {
		isAliveThread t1= new isAliveThread ();
		isAliveThread t2 =new isAliveThread ();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}

}
