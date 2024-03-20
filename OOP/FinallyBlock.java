package OOP;
//always executed weather exception occured or not
public class FinallyBlock {
public static void main(String[] args) {
	try {
		int a= 40/0;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println("cant divide by zero");
	}
	finally {System.out.println("finally block is always executed");
}
}
}