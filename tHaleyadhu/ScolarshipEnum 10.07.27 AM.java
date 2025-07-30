package tHaleyadhu;
enum Grade{
	A,B,C,D,E;
}


class student32{
	private int studentId;
	private String name;
	private Grade Grade;
	private int scolarshipAmount;
	private int totalmarks;
	
	
	public   student32(int studentId, String name, int totalmarks)
	{
	this.totalmarks = totalmarks;
	this.name = name;
	this.studentId = studentId;
	this.Grade = calculategrade(totalmarks);
	this.scolarshipAmount = scolarshipAmount(this.Grade);
	}
	public int getstudentid() {
		return studentId;
	}
	public void setstudentid(int studentId) {
		this.studentId=studentId;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public Grade getgrade() {
		return Grade;
	}
	public void setgrade(Grade Grade) {
		this.Grade=Grade;
		
	}
	public int getscolarshipAmount() {
		return scolarshipAmount;
	}
	public void setscolarshipAmount(int scolarshipAmount) {
		this.scolarshipAmount=scolarshipAmount;
		
	}
	public int gettotalmarks() {
		return totalmarks;
	}
	public void settotalmarks(int totalmarks) {
		this.totalmarks=totalmarks;
		
	}
	
	Grade calculategrade(int totalmarks) {
		if (totalmarks >= 250)
			 return Grade.A;
			else if (totalmarks >= 200 && totalmarks < 250)
			return Grade.B;
			else if (totalmarks >= 175 && totalmarks < 200)
			return Grade.C;
			else if (totalmarks >= 150 && totalmarks < 175)
			return Grade.D;
			else
		return	Grade.E;
	}
	
	
	public int scolarshipAmount(Grade Grade){
		switch(Grade) {
		case A:
			return 5000;
		case B:
			return 4000;
		case C:
			return 3000;
		case D:
			return 2000;
		default :
			return 0;
		
		}
	}
	
}
public class ScolarshipEnum {
	public static void main(String[] args) {
		student32 s1=new student32(233,"shashank",233);
		System.out.println("Student Details");
		System.out.println("Student Id:"+s1.getstudentid());
		System.out.println("Student Name:"+s1.getname());
		System.out.println("Student Grade:"+s1.getgrade());
		System.out.println("Scholarship amount:" +s1.getscolarshipAmount());
	}

}
