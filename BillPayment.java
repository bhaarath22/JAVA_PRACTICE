package tHaleyadhu;

abstract class RRpaymentService{
	private double balance;
	private int customerId;
	
	public RRpaymentService(double balance,int customerId) {
		this.balance=balance;
		this.customerId=customerId;
	}
	
		public double getbalance() {
			return balance;
		}
		public void setbalance(double  balance) {
			this.balance =balance;
		}
		public int getcustomerid() {
			return customerId;}
		
		public abstract void payBill(double amount);
			
		}
		
		

		class ShoppingPayment extends RRpaymentService{
		private static int counter=101;
      private String paymentId;
      public ShoppingPayment(double balance, int customerId) {
		super(balance, customerId);
		
	}
	public String getpaymentid() {
		return paymentId;
	}
	public void payBill(double amount) {
		if(amount==getbalance()) {
			paymentId="s"+counter;
		System.out.println("congrats your paymet is done successfuly of Rs:"+getbalance()+"your paymentID is"+paymentId) ; 
		}
		else if(amount<getbalance())
			System.out.println("insufficent balance");
		
		else
			System.out.println("something went wrong");
		counter++;
	}
}
		
class creditcardpayment extends RRpaymentService{
private static int counter=101;
private String paymentId;
private double cashback;
private double balancedue;

	public creditcardpayment(double balance, int customerId) {
		super(balance, customerId);
		
	}
	
	public String getpaymentId() {
		return paymentId;
	}
	public double getcashback() {
		return cashback;
	}
	public double getbalancedue() {
		
		return balancedue;
	}
	
	
	public void payBill(double amount) {
		if(amount>getbalance()) {
			paymentId="C"+ counter;
		balancedue=0;
		cashback=amount-getbalance();
System.out.println("you have sucessfully made payment of:" +amount+ "payment details are");
System.out.println("customerId:"+getcustomerid());
System.out.println("paymentid:"+getpaymentId());
System.out.println("previous due:"+getbalance());
System.out.println("remaining due:"+balancedue);
System.out.println("cashback wallet balance:"+cashback);
		}
		else {
	paymentId="c"+counter;
	cashback=0;
	balancedue=getbalance()-amount;
	System.out.println("   ");
	System.out.println("Congratulations you have sucessfuly made payment of"+amount+"payment details are");
	System.out.println("customerId:"+getcustomerid());
	System.out.println("paymentid:"+getpaymentId());
	System.out.println("previous due:"+getbalance());
	System.out.println("remaining due:"+balancedue);
	System.out.println("cashback wallet balance:"+cashback);
			
		}


counter++;
			
		
	}
	
}


public class  BillPayment {
	public static void main(String[] args) {
		RRpaymentService payments=null;
		payments= new creditcardpayment(10000,2323);
		payments.payBill(1233);
		payments= new creditcardpayment(10000,2323);
		payments.payBill(13);
		
		
		payments= new ShoppingPayment(1343,2323);
		payments.payBill(1343);
		
		System.out.println("    * ");
		System.out.println("  * * * ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
