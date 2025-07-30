package tHaleyadhu;
class Registration{
	String CustomerName;
	String PancardNo;
	int VoterId;
	String PassportNo;
	int LicenseNo;
	long[] TelephoneNo;
//public Registration() {}
	
	public Registration(String CustomerName,String PancardNo,long[] TelephoneNo) {
		this.CustomerName=CustomerName;
		this.PancardNo=PancardNo;
		this.TelephoneNo=TelephoneNo;
	}
public Registration(String CustomerName,int LicenseNo,String PancardNo,long[] TelephoneNo) {
this.CustomerName=CustomerName;
this.LicenseNo=LicenseNo;
this.PancardNo=PancardNo;
this.TelephoneNo=TelephoneNo;
			
	}
public Registration(String CustomerName,int VoterId,int LicenseNo,long[] TelephoneNo) {
this.CustomerName=CustomerName;
this.LicenseNo=LicenseNo;
this.VoterId=VoterId;
this.TelephoneNo=TelephoneNo;
			
	}
public Registration(String CustomerName,String PancardNo,int VoterId,long[] TelephoneNo) {
this.CustomerName=CustomerName;
this.PancardNo=PancardNo;
this.VoterId=VoterId;
this.TelephoneNo=TelephoneNo;
			
	}
	


public String getcustomername() {
	return CustomerName;
	
}
public String getPancardNo() {
	return PancardNo;
	
}
public int getVoterId() {
	return VoterId;
}
public int getLicenseNo() {
	return LicenseNo;
}
		
public long[] getTelephoneNo() {
	return  TelephoneNo;
}
	
}

public class InternetService {
	public static void main(String[] args) {
		long[] telephoneNumbers = { 1234567890, 987654321 };
		Registration c1=new  Registration("bharath", "2fenfe", 2343, telephoneNumbers);
		
		System.out.println("Congratulations Kevin!!! you have been successfully registered for our services with the following details:");
		System.out.println("Customer Name: " + c1.getcustomername());
        System.out.println("Pancard No: " + c1.getPancardNo());
        System.out.println("Voter ID: " + c1.getVoterId());
        System.out.println("License No: " + c1.getLicenseNo());

        long[] telephones = c1.getTelephoneNo();
        System.out.print("Telephone Numbers: ");
        for (long phone : telephones) {
            System.out.print(phone + " ");
        }
		
	}

}
