package fromScratch;
import java.util.Scanner;

class InvalidOperation extends Exception{
	public InvalidOperation(String invalid) {
		super(invalid);
	}
	
}
class   NegativeResultException extends Exception{
	public NegativeResultException(String invalid) {
		super(invalid);
	}
	
}

class IllegalNumberOfArgumentsException extends Exception{
	public IllegalNumberOfArgumentsException(String invalid) {
		super(invalid);
	}
	
}


public class ArthematicException {
public static void main(String[] args) throws InvalidOperation, NegativeResultException {
	try{
Scanner scanner =new Scanner(System.in);
System.out.println("enter the first integer");
	int a =scanner.nextInt();
	System.out.println("enter the second integer");
	int b = scanner.nextInt();
	System.out.println("enteer the operator to perfrom between a&b");
	char operator =scanner.next().charAt(0);
	
	int result =0;
	
	switch(operator) {
	case '+':
		result=a+b;
		break;
		
	case '-':
		result =a-b;
		break;
	case '*':
		result =a*b;
		break;
	case '/':
		
		result =a/b;
		break;
		default:
			throw new InvalidOperation("INVALID OPERATION: CHOOSE +,-,*,/");
			
	}
	
	if(result<0) {
		throw new NegativeResultException("result is negative");
	}
	
	System.out.println("result is:" +result);
}
	
catch	(InvalidOperation|NegativeResultException e ) {
	System.out.println(e.getMessage());
}
	
}
	
	
}

