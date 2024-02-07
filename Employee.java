package tHaleyadhu;
// object&class through constructor.
 class Employe33 {
	int id;
	String name;
	float salary;
	void insert( int rollnumber, String peru,float jetham) {
	    	id =rollnumber;
		name =peru;
		salary =jetham;
		
	}
void Display() {
	System.out.println(id+"  "+name+"  "+salary);
}
 }

class Employee{
	public static void main(String[] args) {
		
		Employe33 e1=new Employe33();
		Employe33 e2=new Employe33();
		Employe33 e3=new Employe33();
		
		
		e1.insert(1, "Trago",23333);
		e2.insert(2, "vamshi",3);
		e3.insert(3, "rahul",3333);
	   
	
	e1.Display();
	e2.Display();
	e3.Display();
	
	
	
}
}
