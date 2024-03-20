package OOP;
// default NORM_PRIORITY value 5, MIN_PRIORITY 1,MAX_PRIORITY 10.
public class ThreadPriority extends Thread {
public void run() {
	System.out.println("name of the  thread name:"+Thread.currentThread().getName());
	System.out.println("Thread priority:"+Thread.currentThread().getPriority());
	
}
public static void main(String[] args) {
	ThreadPriority t1 =new ThreadPriority();
	ThreadPriority t2=new ThreadPriority();
	ThreadPriority t3= new ThreadPriority();
	
t1.setPriority(MAX_PRIORITY);
t2.setPriority(MIN_PRIORITY);

t1.start();
t2.start();
t3.start();
	
	
	
	
}
}
