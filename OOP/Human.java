package OOP;

public class Human {
	// constructor is a special method it is called when a object is instantiated(created).

	String name;
	int age;
	double weight;
	String color;
	 // creation of constructor
	Human(String name,int vayasu,double baruvu, String ranghu){
		this.name =name;
		age =vayasu;
		weight = baruvu;
		color = ranghu;
	}
	Human(String name, int vayasu){
		this.name =name;
		age =vayasu;
	}
	void eat() {
		System.out.println(this.name+"is eating good food ");
	}
	void drink() {
		System.out.println(+age+ "drinking water");
	}
}
