package OOP;

/*abstract class bike{
abstract void run();	
 }

 class honda4 extends bike{
	 void run() {
		 System.out.println("running safely");
		 
	 }
 }



public class AbstMethod {
	public static void main(String args[]) {
		
		bike b1 =new honda4();
		b1.run();
			
		
		
	}

}*/


/*
abstract class shape1{
	abstract void draw();	
	
}
 class rectangle extends shape1{
	void draw() {
		System.out.println("rectangle is drawn");
	}
}

class circle extends shape1{
	void draw() {
	System.out.println("circle is drawn");	
	}
}

public class AbstMethod{
	public static void main(String[] args) {
		
		shape1 s1;
		//shape1
		s1 =new rectangle();
		
		s1.draw();
		
		shape1 c1 = new circle();
		c1.draw();
		
	}
}
*/

// INTERFACE ABSTRACT CLASS

interface A2{
	void a();
	void b();
	void c();
	void d();
	void e();
}

abstract class B2 implements A2{
	public void c() {
		System.out.println("i am c");
	}
	public void e() {
	System.out.println("i am e");}
}


class C3 extends B2{
public	void a() {
	System.out.println("i am a");
	}
public	void b() {
	System.out.println("i am b");
	}
public	void d() {
	System.out.println("i am d");
	}

}


public class AbstMethod{
	public static void main(String[] args) {
		
		A2 obj =new C3();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		obj.e();
		
		
	}
}












