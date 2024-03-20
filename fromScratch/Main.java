package fromScratch;

 /*public class helloWorld {
public static void main( String args[]) {
	System.out.println( "hello world");
}
}
*/

public class Main {
    public static void main(String[] args) {
        // Declare and initialize integer variable 'n'
        int n = 5;
        System.out.println("Value of n: " + n);

        // Declare and initialize integer array 'a' with squares of the first five integers
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = (i + 1) * (i + 1);
        }
        System.out.println("Contents of array a:");
        for (int value : a) {
            System.out.print(value + " ");
        } 
        System.out.println();

        // Calculate the average of values in array 'a'
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        double average = (double) sum / a.length;
        System.out.println("Average of values in array a: " + average);

        // Create array 'b' with elements in reverse order of array 'a'
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        System.out.println("Contents of array b (reverse order of array a):");
        for (int value : b) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Calculate and print the first 10 Fibonacci numbers
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("First 10 Fibonacci numbers:");
        for (int value : fibonacci) {
            System.out.print(value + " ");
        }
    }
}
