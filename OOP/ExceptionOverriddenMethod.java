package OOP;
// if super class method is not defined a exception then child class overridden methods cant 
// declare checked exception but it can declare unchecked exception. if super class method
// declared exception then child class overridden method can have same exception,subclass exception
//no exception but not parent exception.
import  java.io.*;

class parent{
void  message()throws ArithmeticException {
	System.out.println("System pad dengay");
}
}
class child extends parent{
//	void message()throws IOException //compile time error
	//void message()throws Exception 	//cannt declare parent exception
	void message()throws ArithmeticException
	{
		System.out.println("compile time error");
	}
}
public class ExceptionOverriddenMethod {
public static void main(String[] args) {
	parent p= new parent();
	parent c =new child();
	c.message();
	p.message();
}
}
