package FileHandling;
import java.io.*;
public class ReadPassword {
public static void main(String[] args) {
	Console c= System.console();
	System.out.println("enter your password");
	char[] d= c.readPassword();
	String s= new String(d);

	System.out.println("password is:"+s);
}
}
/*The NullPointerException you're encountering indicates that the Console object (c) is null.
 *  This can happen when you run your Java program in an environment that does not provide an interactive console, 
 *  such as when running from an IDE like Eclipse or IntelliJ.*/
 