package practiceScratch;

public class Printf {
	public static void main(String[] args) {
		boolean myBoolean = true;
		int myInt =23;
		double myDouble = 23.12;
		char myChar ='@';
		String myString ="bharath";
		//conversion - character
	//	System.out.printf("%b", myBoolean);
	//	System.out.printf("%d", myInt);
	//	System.out.printf("%f",myDouble );
	//	System.out.printf("%c", myChar);
	//	System.out.printf("%s", myString);
	
		// WIDTH - MIN NO OF CHARACTERS TO WRITTEN AS OP
		
		
		//System.out.printf("hello %10s",myString);
		
	//	System.out.printf("You have this much money %.1f",myDouble);
		
		
		System.out .printf("You have this much money %020f", myDouble);
	} 
		
		
		
	}


