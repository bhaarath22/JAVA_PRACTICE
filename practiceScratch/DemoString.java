package practiceScratch;

public class DemoString {
	public static void main(String args[]) {
		String s= new String("how are you");
		//length of s
		System.out.println("length of string is:"+s.length());
		//modify s
		System.out.println("modify the string:"+s.replace('n', 'N'));
		// uppercase
		System.out.println("string to upper case:"+s.toUpperCase());
		//lower case
		System.out.println("string to lower case:"+s.toLowerCase());
		
		
	}

}
