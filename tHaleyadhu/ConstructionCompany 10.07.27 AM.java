package tHaleyadhu;
class employe12{
	private int employeID;
	private String name;
private  double salary;
	public employe12(int employeID,String name,double salary){
		this.employeID=employeID;
		this.name=name;
		this.salary=salary;
	}
	public int getemployeId() {
		return employeID;
	}
	public void setemployeId(int id) {
		employeID=id;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
		
	}
	
	
}
class PermanentEmployee extends employe12{
	private double basicpay;
	private double hra;
	private int experience;
	
public	PermanentEmployee(int employeID,String name,double salary,double basicpay,double hra,int experience){
		super(employeID,name,salary);
	this.basicpay=basicpay;
		this.hra=hra;
		this.experience=experience;
	}
	
	public double getbasicpay() {
		return basicpay;
	}
	public void setbasicpay(double basicpay) {
		this.basicpay=basicpay;
	}
	public double gethra() {
		return hra;
	}
	public void sethra(double hra) {
		this.hra=hra;
	}
	public int getexperience() {
		return experience;
	}
	public void setexperience(int experience) {
		this.experience=experience;
	}
	public void calculateSalary() {
		double variableComponent;
		if(experience<3)
			variableComponent=0;
		else if((experience>=3)&&(experience<5))
		variableComponent=basicpay*0.05;
		else if((experience>=5)&&(experience<7))
			variableComponent=basicpay*0.07;
		else 
			variableComponent=basicpay*0.12;
		
		setsalary(variableComponent+basicpay+hra);
		//salary= variableComponent+basicpay+hra;
	
		
	}
}

class contractEmployee extends employe12 {
	
	private double wages;
	private int hours;

		
	
	public  contractEmployee(int employeID,String name,double salary,double wages,int hours) {
		super(employeID,name,salary);
		this.wages=wages;
		this.hours=hours;
	}
	 
	
	public double getwages() {
		return wages;
	}
	public void setwages(double wages) {
		this.wages=wages;
	}
	public int gethours() {
		return hours;
	}
	public void sethours(int hours) {
		this.hours=hours;
	}
	public void calculateSalary() {
		setsalary(hours*wages);
	}
	
}


public class ConstructionCompany {
public static void main(String[] args) {
	PermanentEmployee e1=new PermanentEmployee(23,"pragathi",230000,10000,1500,4);
	e1.calculateSalary();
	System.out.println(e1.getsalary());
}
}
