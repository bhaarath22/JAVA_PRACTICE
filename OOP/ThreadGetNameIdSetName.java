package OOP;
// getName(),setName(),getId().
public class ThreadGetNameIdSetName extends Thread{
public void run() {
	System.out.println("thread is running");
}
public static void main(String[] args) {
	ThreadGetNameIdSetName t1= new ThreadGetNameIdSetName();
	ThreadGetNameIdSetName t2 =new ThreadGetNameIdSetName();
	System.out.println("name of thread1 is:"+t1.getName());
	System.out.println("name of thread1 is:"+t2.getName());
	System.out.println("id of thread1 is:"+t1.getId());
	
	
	t1.start();
	t2.start();
	t1.setName("shit");
	System.out.println("after changing   :"+t1.getName());
}
}
