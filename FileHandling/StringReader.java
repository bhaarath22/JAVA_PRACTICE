package FileHandling;
import java.io.*;
public class StringReader {
public static void main(String[] args) throws IOException {
	String text;
	InputStreamReader r1= new InputStreamReader(System.in);
	BufferedReader b1= new BufferedReader(r1);
	text=b1.readLine();
	System.out.println(text);
	
}
}
