package OOP;
// waits for a thread to die
public class JoinThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinThread j1= new JoinThread();
		JoinThread j2=new JoinThread();
		JoinThread j3 =new JoinThread();
		j1.start();
		try {
			j1.join(1500);
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		j2.start();
		j3.start();
	}
	
	
}
