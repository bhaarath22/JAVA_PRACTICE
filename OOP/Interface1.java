package OOP;

/*interface printTable{
	void print();
		
	
}
class Interface1 implements printTable{
	 public void print() {System.out.println("hello  world");}

public static void main(String[] args ) {
	Interface1 obj = new Interface1();
	obj.print();
}
} */


/*
 
interface drawable{
	void draw();
	
}

class rectangle2022 implements drawable{
	 public void draw() {
		System.out.println("rectangle is drawn");
		
	}
}

class circle2022 implements drawable{
	 public void draw() {
		System.out.println("circle is drawn");
	}
}

public class Interface1{
	public static void main(String args[]) {
		
		drawable r1 = new rectangle2022();
		
		drawable c1 = new circle2022();
		
		c1.draw();
		r1.draw();
		
	}
}

*/ 

/*
//multiple inheritance in java using interface


 interface printtable{
	void print();
}

interface showtable{
	void show();
}

class b2 implements printtable,showtable{
	
public	void print() {System.out.println(" table is here");}
public	void show() {System.out.println(" show table");}
}

public class Interface1{
	public static void main(String[] args) {
		
		b2 p1 = new b2();
		
		p1.show();
		p1.print();
		
	}
	
	
} */

/*
// interface extends another interface

interface printtable{
	void print();
}

interface showtable extends printtable{
	void show();
}

class b2 implements showtable{
	
public	void print() {System.out.println(" table is here");}
public	void show() {System.out.println(" show table");}
}

public class Interface1{
	public static void main(String[] args) {
		
		b2 p1 = new b2();
		
		p1.show();
		p1.print();
		
	}
}
*/
/*
interface drawable{
	void draw();
	static int cube( int x) {
		return x*x*x;
	}
}

class rectangle2 implements drawable{
	 public void draw() {
		System.out.println("drawn");
		
	}
}

public class Interface1{
	public static void main(String[] args) {
		drawable d = new rectangle2();
		d.draw();
		System.out.println(drawable.cube(2));
	}
}

*/



/*
// NESTED INTERFACES WITHIN INTERFACE

interface showable{
	void show();
	interface message{
		void msg();
			
		
	}
}

 class test2 implements showable.message{//.message{
	
//public	void show() {System.out.println(" batman");}
		 
	
	public void msg() {
	 System.out.println("hello nested interface");
	 }
}

public class Interface1 {
	public static void main(String[] args) {
	//	showable.
	//	message 
		showable.message n1 =new test2();
		n1.msg();
		
	}
}


*/

// BY CLASS NESTED INTERFACE

class A{
	interface message{
		void msg();
	}
}

class test3 implements A.message{
	public void msg() {
		System.out.println(" message is printed");
		
	}
}

public class Interface1{
	public static void main(String[] args) {
		A.message n2 =new test3();
		n2.msg();
			
	}
}












