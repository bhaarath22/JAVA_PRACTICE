package tHaleyadhu;
import java.util.*;
public class AmstrongLucky {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Please enter your chooice 1 or 2");
	int choice =scanner.nextInt();
	
	switch(choice) {
	case 1:
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		int numcopy=num;
		System.out.println("1:calculate amstrong number");
		System.out.println("2:calculate lucky number");
		System.out.println("your choice is"+choice);
		int I=0;
		for(int i=num;i!=0;i/=10) {
			I++;
		}
	int sum=0;
	while(num!=0) {
		int reminder=num%10;
		sum+=Math.pow(reminder, I);
		num=num/10;
	}
	if(sum==numcopy)
		System.out.println(sum+" is an amstrong number");
	else
		System.out.println(sum+"is not an amstrong number");
	case 2:
		
		System.out.println("enter a number");
		int num1=scanner.nextInt();
		int n=num1;
		int num1copy=num1;
		System.out.println("1:calculate amstrong number");
		System.out.println("2:calculate lucky number");
		System.out.println("your choice is"+choice);
		int in =0, sum1=0,remainder1=0;
		while(num1!=0) {
			in++;
			num1/=10;
		}
		for(int j=in;j!=0;j--)
		{
			remainder1=n%10;
			if(j%2==0)
sum1=remainder1*remainder1;			
			
		}
		n/=10;
		
	
if(sum1%9==0)
	
	System.out.println("the number  "+num1copy+" is a lucky numbrt");
else
System.out.println("The number " +num1copy + " is not a Lucky Number");
break;
default:
System.out.println("Oops! Invalid Choice");
	}
	
}
}
