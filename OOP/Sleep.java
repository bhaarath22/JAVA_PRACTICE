package OOP;

public class Sleep extends Thread {
public void run() {
	for (int i=0;i<5;i++) {
		try {
			Thread.sleep(234);
		}
		catch(InterruptedException e) {
			System.out.println("e");
		}
		System.out.println(i);
	}
	
}
public static void main(String[] args) {
	Sleep s1= new Sleep();
	Sleep s3= new Sleep();
	s1.start();
	s3.start();
}
}
