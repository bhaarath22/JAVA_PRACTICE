package OOP;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionFile {
public static void main(String[] args ) {
	PrintWriter f1;
	try {
		f1=new PrintWriter("black");
		f1.write("i am black");
		
	}
	catch(FileNotFoundException e) {
		System.out.println("the file you are searchin is not found");
	}
	System.out.println("file saved");
}
}
