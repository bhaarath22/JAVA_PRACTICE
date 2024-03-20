package fromScratch;

public class MaxMin_Values {
	public static void main(String[] args) {
		// define an array of numbers
		int[] numbers= {1,3,4,6,12};
		int max= numbers[0];
		int min= numbers[0];
		for(int i= 1; i< numbers.length;i++) {
			if(numbers[i]>max) {
				max =numbers[i];			
			}
			if(numbers[i]<min) {
				min= numbers[i];
				
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}
	
	

}
