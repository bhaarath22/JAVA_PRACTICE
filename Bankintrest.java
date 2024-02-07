package tHaleyadhu;

public class Bankintrest {
	public static void main(String[] args) {
		double balance=5000;
		double rateofintrest =.10;
		double intrest=0;
		double withdraw=400;
		double depoist =50;
		for(int i=1;i<=12;i++) {
			balance +=depoist;
		balance-=withdraw;
			intrest =balance*rateofintrest;
			balance+=intrest;
			System.out.println("the intrest for the month is:"+i+ +intrest);
			
		}
		System.out.println("balance is:"+balance);
	}
	

}
