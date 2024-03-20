package fromYoutubeOPPs;
//Encapsulation =attributes of a class will be hidden or private,
          //Can be accessed only through methods (getters & setters)
         //You should make attributes private if you don't have a 
        //reason to make them public/protected

class car2{
private	String make;
private	String model;
private	int year;
	
	car2(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		//OR
		this.setmake(make);
		this.setmodel(model);
		this.setyear(year);
	}
	
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getyear() {
		return year;
	}
	public void  setmake(String make) {
		this.make= make;
	}
		
	public void  setmodel(String model2) {
		model =model2;
	}
	public void  setyear(int year) {
		this.year =year;
	}
	
}



public class Encapsulation1 {
	public static void main(String[] args) {
		
		car2 car =new car2("suv","thar",2022);
		car.setyear(22);
		car.setmodel("jeep");
		car.setmake("rr");
		System.out.println(	car.getmake());
		System.out.println(	car.getmodel());
	System.out.println(	car.getyear());
		
	}

}
