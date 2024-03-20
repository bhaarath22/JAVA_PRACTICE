package OOP;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[]= new int[4];
			a[4]=50/0;
			System.out.println(a[10]);//2nd exception but at a time only one exception only occurs
		}
		
		/*catch(Exception e) {
			System.out.println(e);
		}  */
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of boundary");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
// if order in catch block is not maintainde then complie time error may occur.