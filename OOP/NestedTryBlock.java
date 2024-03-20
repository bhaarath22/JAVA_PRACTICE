package OOP;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			try{ 
				System.out.println("divide two numbers");
			int a=43/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]= {1,2,3,4,5};
				System.out.println(a[45]);
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
	
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Normal Flow");
	}

}
