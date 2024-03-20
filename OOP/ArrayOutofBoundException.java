package OOP;

public class ArrayOutofBoundException {
public static void main(String[] args) {
	try {
		int a[]= {1,2,3,4};
		System.out.println("display"+a[6]);
}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("array index out of boundary");
	}
		
	}
}
