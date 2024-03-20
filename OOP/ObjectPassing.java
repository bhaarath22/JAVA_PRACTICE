package OOP;

class Car2{
	String name;
	int num;
	Car2(String name,int vechnum){
		this.name=name;
		num=vechnum;
	}
	
}
class Garage{
	void park(Car2 car) {
		
		System.out.println("the car  "+car.name+" of vechnumber:  "+car.num+"  is parked");
		
	}
}






public class ObjectPassing {
public static void main(String[] args) {
	
	Garage garage = new Garage();
	
//	garage.park(car);
	Car2 car1 =new Car2("BMW",2323);
	Car2 car2 =new Car2("tesla",2333);
	garage.park(car1);
	garage.park(car2);
	
}
}
