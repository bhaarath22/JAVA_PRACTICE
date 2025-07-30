package tHaleyadhu;

import java.util.Scanner;


public class ReverseOfNumber {
	public static void main(String[] args) {
		int  reverse=0;
		int n=0;
	Scanner a=new Scanner(System.in);
	
	System.out.println("enter the number to reverse it");
   n=a.nextInt();
  /*//for loop
int sum=0;
for(;n!=0;n=n/10) {
	int reverse=n%10;
	sum=sum*10+reverse;
}
	System.out.println("reverse of the number is:"+sum);*/
	
	
	//while loop

  while(n!=0) {
	 
	  reverse=reverse*10;
	 
	 reverse=reverse+n%10;;
	 n=n/10; 
	 
		
  }
  System.out.println("reverse of the number is:"+reverse);
	
}}
