package practiceScratch;

public class BikeCONStructor {
	/*Bike(){
		System.out.println("the bike is created");
	}
public static void main(String[] args) {
	Bike  b = new Bike();
	
}*/
	 // no constructor is created so java creates a default constructor abd provides default valuse as type
/*	 int id;
	String name;
	void display() {
		System.out.println( id+""+name);
	}
	public static void main( String[] args) {

		Bike b1= new Bike();
		Bike b2 = new Bike();
		b1.display();
		b2.display();
		
	}
}*/
	//parametarized constructor
/*	int id;
	String name;
	
	BikeCONStructor(int i,String s){
		 id = i;
		name= s;
		}
		void display() {System.out.println(id+" "+name);}
		public static void main(String args[]) {
			BikeCONStructor b1=new BikeCONStructor(2003 ,"ninja");
			Bike b2 = new Bike(2222, "triumph street triple");
			b1.display();
			b2.display();
			//b1.display();
			//b1.display();
			
			
		}		
	}*/
	//constructor overloading
	
	int id;
	String name;
	int age;
	BikeCONStructor (int i,String s){
		id=i;
		name = s;
	}
	BikeCONStructor (int i,String s,int a){
		id =i;
		name=s;
		age=a;
		
	}
	void display() { System.out.println(+id+"  "+name+"  "+age);
	
	}
	public static void main(String[] args) {
		BikeCONStructor  b1=new BikeCONStructor (23,"zx10R");
		BikeCONStructor b2 = new BikeCONStructor(23,"triumph",22);
		b1.display();
		b2.display();
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
