package FileHandling;
import java.io.*;
public class BufferedReader2 {
public static void main(String[] args)throws Exception {
	InputStreamReader i1= new InputStreamReader(System.in);
	BufferedReader b1= new BufferedReader(i1);
	//System.out.println("enter your name");
	//String name=b1.readLine();
	String name="";
	while(!name.equals("stop")) {
		System.out.println("enter your name");
		name=b1.readLine();
		System.out.println("welcome  "+name);
	}
	//System.out.println("welcome  "+name);
	b1.close();
	i1.close();
	
}
}
