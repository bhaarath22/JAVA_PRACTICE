package tHaleyadhu;
class employee1{
	String name;
	String address;
public	double salary;
	int age;
	employee1(String name,String address,double salary,int age){
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.age=age;
		
	}
	
public	void riseSalary() {
		this.salary=this.salary*1.2;
	}
}
public class Worker1 {
	public static void main(String[] args) {
	employee1 e1 =new employee1("bharath","khammam",12220,19); 
		
	employee1 e2 =new employee1("shashank","khammam",12220,19); 
	e1.riseSalary();
	System.out.println(e1.salary);
	System.out.println(e2.salary);
	
	
	}

}
