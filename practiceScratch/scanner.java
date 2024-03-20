package practiceScratch;
import java.util.Scanner;

public class scanner {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("type a number:");
		int count= console.nextInt();
		
		int sum=0;
		for(int i=1;i<=count;i++) {
		System.out.println("enter a number:");
		sum=sum+console.nextInt();
		}
		System.out.println(+sum);	
	}
//System.out.println(+sum);	
}
