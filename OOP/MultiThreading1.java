package OOP;
//thread example by extending Thread class
public class MultiThreading1 extends Thread {
public void run() {
	System.out.println("thread is running");
}
public static void main(String[] args) {
	MultiThreading1 e1=new MultiThreading1();
e1.start();
	
}
}
