package practiceScratch;
import java .util.Scanner;
public class scaner {
	public static void main(String args[]) {
		
	
/*	Scanner sc =new Scanner(System.in); 
	System.out.println("enter a int :");
	
	while(sc.hasNextInt()){
		int i= sc.nextInt();
		System.out.println("you entered:" +i);
		System.out.println("enter a new number:");
		
	}*/
	Scanner test =new Scanner(System.in);
	/*System.out.println("how old are you ?");
	int age= console.nextInt();
	if(age<19)
	System.out.println(age+ ":that qute young!");
	else;
	Sstem.out.println(age+":that quite old!");
		*/
	
	
/*	  System.out.println("enter any three numbers");
	int num1 =console.nextInt();
	int num2 = console.nextInt();
	int num3 = console.nextInt();
	int sum = num1+num2+num3;
	
	System.out.println("sum of three numbers is:"+sum);*/
	
	System.out.println("how many numbers do you want to print:");
	int count= test.nextInt();
	int sum =0;
	for(int i=1 ;i<=count;i++) {
		System.out.println( "enter a number:");
		sum=sum+test.nextInt();
		
	}
System.out.println(+sum);	
}
}
	


