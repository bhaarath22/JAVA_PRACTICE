package FileHandling;
import java.io.Console;
//import java.util.Scanner;
import java.io.*;
public class ConsoleRead {
public static void main(String args[]) {
	Console c= System.console();
	//Scanner scanner =new Scanner(System.in);
	
	System.out.println("enter your name");
	//String a= scanner.nextLine();
	String s= c.readLine();
	System.out.println("welcome:"+s);
}
}
