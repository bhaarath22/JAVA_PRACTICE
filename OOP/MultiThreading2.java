package OOP;
// thread example by implementing runnable interface
public class MultiThreading2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
	}
public static void main(String[] args) {
	MultiThreading2 e1 =new MultiThreading2();
	Thread t1= new Thread(e1);//necessary so e1 gets treated as thread object and runs the runnable interface
	t1.start();
}
}
