package OOP;
//method overriding = Declaring a method in sub class,
//which is already present in parent class.
//done so that a child class can give its own implementation


/*class animal{
	void speak() {
		System.out.println("the animal is speaking");
		
	}
}
class dog extends animal{
	//overriding
	void speak() {
		System.out.println("the dog is barking");
		
	}
	
}

public class MethodOveridding {
 public static void main(String[] args) {
	 animal a1 = new animal();
	 dog d1 = new dog();
	 d1.speak();
	
	 a1.speak();
 }
}
*/

class bank3{
	
	  int rateOfIntreset() 
		
	{return 0;}
}

class SBI3 extends bank3{
	int rateOfIntreset() 
	{return 5;}
	
}


class ICICI extends bank3{
	int rateOfIntreset() 
	{return 7;}
}

class kotak extends bank3{
	int rateOfIntreset() 
	{return 3;}
}

public class MethodOveridding{
	public static void main(String[] args) {
		
		SBI3 p1 =new SBI3();
		ICICI p2 =new ICICI();
		kotak p3 =new kotak();
		
		
		System.out.println(p1.rateOfIntreset());
		System.out.println(p2.rateOfIntreset());
		System.out.println(p3.rateOfIntreset());
		
	}
		
}















