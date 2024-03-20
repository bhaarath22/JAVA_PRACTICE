package OOP;
public class ExceptionhandlinginCatchBlock {
public static void main(String[] args) {
	int i=50;
	int j=0;
	int product;
	try {
		product=i/j;
	}
	catch(Exception e) {
		System.out.println(i/(j+2));
		
	}
}
}
