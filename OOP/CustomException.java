package OOP;
// user can define his own exception and message
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		//s="fuck off";
		super(s);
	}
}
class voting{
 static void validate(int age)throws InvalidAgeException {
	if (age<18)
		throw new InvalidAgeException("not valid");
	
	else
		System.out.println("welcome to vote");
	
	
	
	}
}

public class CustomException {
	public static void main(String[] args) {
		voting v1= new voting();
			
		try {
			v1.validate(4);
		}
		catch(InvalidAgeException e) {
			System.out.println("exception occured"+e);
		}
		
		System.out.println("rest of the code");
	}

}
