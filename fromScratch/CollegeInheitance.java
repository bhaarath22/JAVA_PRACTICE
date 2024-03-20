package fromScratch;

class person1{
private String name;
private String address;
person1(String n,String a){
	name=n;
	address=a;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public void  setAddress(String a) {
	address=a;
}
public String toString() {
	return name+" "+address;
}
		
}
class student1 extends person1{
	private String Program;
	private int Year;
	private double Fee;
public	student1(String name,String address,String program,int year,double fee) {
	
	
	super(name,address);
	Program=program;
	Year=year;
	Fee=fee;
	
}
	
public String getProgram() {
	return Program;
}
public void setprogram(String program) {
	Program=program;
	
}
public int getYear() {
	return Year;
}
public void setYear(int year) {
	Year =year;
	
}
public double getFee() {
	return Fee;
}
public void setFee(double fee) {
	Fee=fee;
	
}
public String toString() {
	return  super.toString()+" " +Program+ " "+Year+ " "+Fee;
}
}

class Employee1 extends person1{
	
	
	private String School;
	private double Pay;
	
	Employee1(String name,String address, String school,double pay){
		super(name,address);
		School=school;
		Pay=pay;
		
		
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School=school;
		
	}
	public double getPay() {
		return Pay;
	}
	public void setpay(double pay) {
		Pay=pay;
	}
	public String toString() {
		return super.toString()+" " +School+ ""+Pay;
	}
	
}
public class CollegeInheitance {
	public static void main(String[] args) {
		person1 p1 =new person1("Rahul","Telangana");
		
		System.out.println(p1.toString());
		
		student1 s1 =new student1("Vishnu","AndhraPradesh","Robotics&AI",3,120000);
		
		System.out.println(s1.toString());
		
		
 person1 e1 = new Employee1("Vamshi","Telangana","govt",23000);
 
 System.out.println(e1.toString());
	}

}
