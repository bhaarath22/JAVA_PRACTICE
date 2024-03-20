package practiceScratch;
// this keyword method invoking
/*class a{
void m() {
	System.out.println("this m");}

	void n() {
		System.out.println("this is n");
		this.m();
	}
}

public class thisMethod {
public static void main (String[] args ) {
	a b =new a();
	b.n();
}
}
*/





// this keyword constructor

/*
class A{
	 
	A() {
		// calling parameteraized constructor from default constructor
		this(5);
	System.out.println("the gangster")	;
	
	}
	A(int x){
		// calling default from parameterazied constructor
		//this();
		System.out.println(x);
		
		
	}
}

public class thisMethod {
	public static void main(String[] args) {
		A a= new A();
		//A a= new A(12);
		
	}
}
*/


class A{
	String name,course;
	int RollNo;
	float fees;
	
	A(String name,String course,int RollNo){
		this.name=name;
		this.RollNo =RollNo;
		this.course=course;
	}
	
	
	A(String name,String course,int RollNo,float fees){
		this(name,course,RollNo);// reusing the constructor
		this.fees=fees;
		
	}
	void display(){System.out.println(RollNo+"  "+name+"  "+course+"  "+fees);}
}


public class thisMethod {
	public static void main(String args[]) {
		A student1 = new A("bharath","R&AI",22);
		
		A student2 = new A("bharath","R&AI",22,23f);
		
		student1 .display();
		student2 .display();
		
		
	}}





































