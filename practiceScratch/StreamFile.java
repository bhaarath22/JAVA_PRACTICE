package practiceScratch;

//import java.io.IOException;
import java.io.*;
public class StreamFile {
public static void main(String[] args) throws IOException {
	System.out.println("simple message");
	System.err.println("error message");
	
	int i= System.in.read();
	System.out.println((char)i);
}
}
