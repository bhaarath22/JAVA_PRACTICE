package tHaleyadhu;

 class Account {
	
	private int accountNo;
	private String name;
	private double amount;
	 
	public  Account(int a,String b,double amt) {
		 accountNo =a;
		 name =b;
		 amount =amt;
		 
	 }
	 
public	 void deposit(double amt) {
		 amount =amount+amt;
		 System.out.println(amt+"deposited");
		 System.out.println( "amount after depositing:" +amount);
	 }
	 
public void withdraw(double amt) {
	if(amount<amt) { 
		System.out.println("insufficent balance");
	}
	else{
	amount =amount-amt;
	System.out.println(amt+"withdraw");
	System.out.println("amout after withdrawn:" +amount);
	}
	
	
}

public void checkBlance() {
	System.out.println("blance is:" +amount);
}
 public void display() {
	System.out.println(accountNo+" , "+name+", " +amount);
}
 
}
 
 
 
 public class BankAccount{
	 public static void main(String[] args) {
		 
		 Account a =new Account(22222,"bharath",2323 );
		 Account b =new Account(222,"rahul",23);
		 System.out.println("hllo");
		
		 
		 a.display();
		 a.checkBlance();
		 a.deposit(22);
		a.withdraw(33);
		
	/*	b.insert(22222,"bharath",2323);
		 
		b.insert(2,"bhdbcden",323);
		 b.display();
		 b.checkBlance();
		 b.deposit(22);
		b.withdraw(33);
	 */
	 }
	 
 }
 
 
 
 
 
 
 
 
 
 
 
