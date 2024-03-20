package practiceScratch;
import java.util.Scanner;
public class NestedLopp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int rows;
	int cloumns;
	String symbol = "";
	
	System.out.println("enter the no.of rows:");
	 rows= scanner.nextInt();
	 
	 System.out.println("enter the no.of columns:");
	 cloumns=scanner.nextInt();
	 System.out.println("enter the symbol you want to enter");
	 symbol=scanner.next();
	 
	 for( int i=1; i<=rows;i++) {
		 System.out.println();
		for(int j=1;j<=cloumns;j++) {
			System.out.println(symbol);
		
		
	 }
	
	 }
	
}


}

