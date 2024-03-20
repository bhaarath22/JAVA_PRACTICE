package practiceScratch;

public class CounterStatic {
	 static int count =0;
	
	CounterStatic(){
		count++;
		System.out.println(count);
	}
public static void main(String[] args) {
	CounterStatic s1 =new CounterStatic();
	CounterStatic s2 = new CounterStatic();
	CounterStatic s3 = new CounterStatic();
	
	
}
}
