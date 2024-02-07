package tHaleyadhu;

import java.util.Scanner;

public class RetailShop {
	public static void main(String[] args){
		int billID;
		int customerID;
		double discount;
		int billAmount;
		
		Scanner A =new Scanner(System.in);
		
	System.out.println("enter the bill id");
	billID= A.nextInt();
	System.out.println("the bill id is:"+billID);
	System.out.println("enter the customerid");
	customerID =A.nextInt();
	System.out.println("the customerid is:"+customerID);
	System.out.println("enter the discount");
	discount =A.nextDouble();
	System.out.println("the discount is:"+discount);
	System.out.println("enter the bill amount");
    billAmount =A.nextInt();
    System.out.println("the bill amount is:"+billAmount);
    
    double discountedBillAmount = (billAmount - billAmount*(discount/100));
    
    System.out.println("your bill after the discount is:"+discountedBillAmount);
    
	}

}
