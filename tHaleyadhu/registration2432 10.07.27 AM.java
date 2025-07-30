package tHaleyadhu;

class eventregistration{
	String Name;
	String NameoftheEvent;
	double Fee;
	public eventregistration(String Name,String NameoftheEvent){
		this.Name=Name;
		this.NameoftheEvent=NameoftheEvent;
	}
	public String getname() {
		return Name;
	}
	public void setname(String Name) {
		this.Name=Name;
	}
	public String getnameofevent() {
		return NameoftheEvent;
	}
	public void setnameofevent(String NameoftheEvent) {
		this.NameoftheEvent=NameoftheEvent;
	}
	public double getRegistrationFee() {
		return Fee;
	}
public void setRegistrationFee(double Fee) {
	this.Fee=Fee;
}
public void registerevnt() {
	
	if(NameoftheEvent=="ShakeAleg")
		Fee=100;
	else if(NameoftheEvent=="sing&win")
		Fee=150;
	
	else if(NameoftheEvent=="Actathon")
		Fee=70;
	else if(NameoftheEvent=="playaway")
		Fee=130;
	System.out.println("sucessfully registerd for the event");
}}	

class SingleEventRegistration extends eventregistration{
int participantNo;
	public SingleEventRegistration(String  Name, String NameoftheEvent,int participantNo) {
		super(Name, NameoftheEvent);
		this. participantNo= participantNo;
	}
	public int getparticipantno() {
		return participantNo;
	}
	public void setparticipantno(int participantNo ) {
		this.participantNo=participantNo;
	}
	
	public void registerevnt() {
		if(NameoftheEvent=="ShakeAleg")
			Fee=100;
		else if(NameoftheEvent=="sing&win")
			Fee=150;
		else if(NameoftheEvent=="playaway")
			Fee=130;
		System.out.println("sucessfully registerd for the event");	
}}

class TeamEventRegistration extends eventregistration{
int NoOfParticipants;
int TeamNo;
	public TeamEventRegistration(String Name, String NameoftheEvent ,int NoOfParticipants,
	int TeamNo) {
		super(Name, NameoftheEvent);
		this.NoOfParticipants=NoOfParticipants;
		this.TeamNo=TeamNo;
	}
	
	public int getNoOfParticipants() {
		return NoOfParticipants;
	}
	public void setNoOfParticipants(int NoOfParticipants) {
		this.NoOfParticipants=NoOfParticipants;
		
	}
	public int getTeamNo() {
		return TeamNo;
	}
	public void setTeamNo(int TeamNo) {
		this.TeamNo=TeamNo;
	}
	public void registerevnt() {
		if(NameoftheEvent=="ShakeAleg")
			Fee=50*NoOfParticipants;
		else if(NameoftheEvent=="sing&win")
			Fee=60*NoOfParticipants;
		else if(NameoftheEvent=="Actathon")
			Fee= 80*NoOfParticipants;
		else if(NameoftheEvent=="playaway")
			Fee=100*NoOfParticipants;
		
		System.out.println("sucessfully registerd for the event");
}	
}
public class registration2432 {
public static void main(String[] args) {
eventregistration p1=new SingleEventRegistration("bharayh","sing&win",2);
	p1.registerevnt();
	System.out.println(p1.getRegistrationFee());
}
}

