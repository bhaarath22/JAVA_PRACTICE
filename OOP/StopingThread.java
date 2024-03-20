package OOP;
//stoping a thread using boolean variable exit
public class StopingThread implements Runnable {

	private boolean exit;
	private String name;
	
	Thread t;
	
	StopingThread(String threadname){
		name=threadname;
		t= new Thread(this,name);
		System.out.println("new thread:"+t);
		exit=false;
		t.start();
		
	}
	@Override
	public void run() {
		int i=0;
		while(!exit) {
			System.out.println("name:"+i);
			i++;
			
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println("caught"+e);
		}
		}
		System.out.println(name+"Stopped");
		
	}
public void stop() {
	exit=true;
}
public static void main(String[] args) {
	StopingThread t1 =new StopingThread("firstThread");
	StopingThread t2 =new StopingThread("secondThread");
	try{ 
		Thread.sleep(500);
		t1.stop();
		t2.stop();
		Thread.sleep(500);
	}
	catch(InterruptedException e) {
		System.out.println("caught "+e);
		
	}
	System.out.println("exiting the main thread");
}
}
