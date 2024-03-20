package OOP;
// an exception is 1st thrown from top of stack if it is not caught 
//drops down the top of the stack to the previous method if not caught there exception
// again drops down to previous method and so on until it caught or untill it reaches very bottom of the call stack 
public class ExceptionPropagationUnchecked {
void m() {
	int a=40/0;//unchecked
	
}
void n() {
	m();
}
void p() {
	try {
		n();
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		
	}
}
public static void main(String[] args) {
	ExceptionPropagationUnchecked f= new ExceptionPropagationUnchecked();
	f.p();
	System.out.println("normal flow");
}
}
