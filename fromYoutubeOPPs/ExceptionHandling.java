package fromYoutubeOPPs;
import java.util.InputMismatchException;
import java.util.Scanner;
// exception= an event that occurs execution of a proramgram that ;
//disrupts the normal flow of instruction
public class ExceptionHandling {
public static void main(String[] args) {
	
	/*	Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter a whole number to divide");
		int x =scanner.nextInt();
		
		System.out.println("enter to whole number to divide by");
		int y =scanner.nextInt();
		
		int z= x/y;
		System.out.println("result:"+y);
		
		TO AVOID EXCEPTION ERROR FOR X/0 WE WILL DO LIKE THIS
	*/
	Scanner scanner =new Scanner(System.in);
	try{
	//	Scanner scanner =new Scanner(System.in);
	
	System.out.println("enter a whole number to divide");
	int x =scanner.nextInt();
	
	System.out.println("enter to whole number to divide by");
	int y =scanner.nextInt();
	
	int z= x/y;
	System.out.println("result:"+z);
}
	catch(ArithmeticException e){
		System.out.println(" you cant divide by zero! IDIOT!");
	}
//	catch(InputMismatchException e) {
//		System.out.println(" please enter a valid number");
	//}
	// for all type of exceptions
	catch(Exception e) {
		System.out.println(" something went worng");
	}
	finally {
		scanner.close();
	}
}
}
