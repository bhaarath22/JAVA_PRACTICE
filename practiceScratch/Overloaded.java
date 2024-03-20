package practiceScratch;
// overloaded methods= methods that share same name but different parameters
//method name+parameters =method signature.
public class Overloaded {
	public static void main(String[] args) {
	int x=	add(1,3,44,44);
		System.out.println(x);
	}
	
	static int add(int a,int b) {
		System.out.println("this overloaded#1");
	
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		System.out.println("this overloaded#1");
		return a+b+c;
	}
	static int add(int a,int b,int c,int d) {
		System.out.println("this overloaded#1");
		return a+b+c+d;
	}
}
