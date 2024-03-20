package fromYoutubeOPPs;
// abstract = anstract classes can not be instantiated,but they can have a subclass
//abstract methods are declared without implementation


abstract class vehicle{
	abstract void run();
}
class car1 extends vehicle{
	void run() {
		System.out.println("the car is moving");
	}
}
public class Abstract1 {
	
public static void main(String[] args) {
	
car1 Car =new car1();
	Car.run();
}
}
