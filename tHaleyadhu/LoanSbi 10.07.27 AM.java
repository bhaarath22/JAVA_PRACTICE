package tHaleyadhu;

public class LoanSbi {
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float intrest;
	private static int loanCounter;
	
	static {
		loanCounter=10;
	}
	public static int getloanCounter() {
		return loanCounter;
		}
public	LoanSbi(){loanCounter++;}
	
public int getloanNo() {
	return loanNo;
}
public void setloanNo(int loanNo) {
	this.loanNo=loanNo;
}
public int getaccountNo() {
	return accountNo;
}
public void setaccountNo(int accountNo) {
	this.accountNo=accountNo;
}
public int getcustomerNo() {
	return customerNo;
}
public void setcustomerNo(int customerNo) {
	this.customerNo=customerNo;
}
public float getloanAmount() {
	return loanAmount;
}
public void setloanAmount(float loanAmount) {
	this.loanAmount=loanAmount;
}
public int getloanDuration() {
	return loanDuration;
}
public void setloanDuration(int loanDuration) {
	this.loanDuration=loanDuration;
}
public float getintrest() {
	return intrest;
}
public void setintrest(float intrest) {
	this.intrest=intrest;
}

public LoanSbi(int accountNo,int customerNo,float loanAmount,int loanDuration,float intrest) {
	
	this.accountNo=accountNo;
	this.customerNo=customerNo;
this.loanAmount=loanAmount;
this.loanDuration=loanDuration;
	this.intrest=intrest;
	
}
public static void main(String[] args) {
	LoanSbi c1= new LoanSbi(23,23,23,2,3);
	System.out.println(getloanCounter());
}

}






