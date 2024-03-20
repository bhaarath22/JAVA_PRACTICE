package OOP;

/*class employe{
	float salary=40000;
	
}

class programmer extends employe{
	int bonus =10000;
}



public class Programmer1 {
public static void main (String[] args) {
	programmer p1 = new programmer();
	
	System.out.println("salary is :"+p1.salary);
	
	System.out.println("bonus is :"+p1.bonus);
	
}
}
*/


/*
//SINGLE INHERITANCE
 
class animal1{
	void eat() {
		System.out.println("eating");
		
	}
}
class dog1 extends animal1{
	
	void bark() {
		System.out.println("dog is barking");
	}
}

public class Programmer1{
	public static void main (String[] args) {
		dog1 d1 =new dog1();
		
		d1.eat();
		d1.bark();
			
		
	}
}

*/

// multi level inheritance

/*
class bird{
	void sing() {
		System.out.println("singing a song");
		
	}
}
class peacock extends bird{
	void dance() {
		System.out.println("nice dance");
	}
}

class pegion extends peacock{
	void noise() {
		System.out.println("too noise");
		
	}
}

public class Programmer1{
	public static void main(String[] args) {
		
		
		peacock p1= new peacock();
		pegion p2 = new pegion();
		
		p2.dance();
		p1.dance();
		p2.sing();
		
		
	}
}
*/
// hierarchical

class bird{
	void sing() {
		System.out.println("singing a song");
		
	}
}
class peacock extends bird{
	void dance() {
		System.out.println("nice dance");
	}
}

class pegion extends bird{
	void noise() {
		System.out.println("too noise");
		
	}
}

public class Programmer1{
	public static void main(String[] args) {
		
		
		peacock p1= new peacock();
		pegion p2 = new pegion();
		
		//p2.dance();
		p1.dance();
		p2.sing();
		p1.sing();
		
	}
}


