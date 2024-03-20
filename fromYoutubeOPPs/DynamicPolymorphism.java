package fromYoutubeOPPs;
import java.util.Scanner;
/*
 * // polymorphism i= many shapes/forms
// dynamic = after compilation (during runtime)
/ex. A corvette is a: corvette, and a car, and a vehicle, and an object
 */
class Animal{
	public void speak() {
		System.out.println("animal speaks *ghrrrr*");
	}
	
}
class dog extends Animal{
	public void speak() {
		System.out.println("dog speaks *bowbow*");
	}
}
class cat extends Animal{
	public void speak() {
		System.out.println("cat speaks *meow*");
	}
}
public class DynamicPolymorphism {
	public static void main(String[] args) {
		Animal animal;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println(" which animal do you want");
		System.out.println("enter 1 for dog or 2 for cat:" );
		int choice = scanner.nextInt();
		
		if (choice==1) {
	 animal= new dog();
	 animal.speak();
		}
		else if (choice == 2) {
			animal = new cat();
			animal.speak();
		}
		else {
			animal = new Animal();
		System.out.println(" invalid choice");
	//or//
		//animal = new Animal();
		animal.speak();}
			
	}

}
