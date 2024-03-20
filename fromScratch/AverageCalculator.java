package fromScratch;

public class AverageCalculator  {
    public static void main(String[] args) {
        
        int[] numbers = { 1,3,4,5,6, };

       int sum= 0;
        for (int num : numbers) {
            sum += num;
        }

      
       int average =( sum / numbers.length);
       System.out.println("sum:"+sum);
        System.out.println("Average: " + average);
    }
}
