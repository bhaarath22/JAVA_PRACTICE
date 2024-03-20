package OOP;
// one class acuiers attributes and methods of another class
// inheritance shareing methods & attributes to the other classes
class vehicle{
	double speed;
	  String color;
		 
	
	
	  void run() {
		  System.out.println("the vehicle is moving");
	
}
	void stop(){
		System.out.println("the vehicle is stoped");
		}
	}

class car22 extends vehicle{
	
	 public int wheel	 =4;
	String color ="black";
	
}
class bycycle extends vehicle{
	int wheels =2;
}



public class Inheritance1 {
	public static void main (String[] args) {
		
		
		car22 car1 =new car22();
		bycycle b1 =new bycycle();
		System.out.println(b1.wheels);
		car1.stop();
	}

}
