package fromYoutubeOPPs;
class car3{
private	String make;
private	String model;
private	int year;
	
	car3(String make,String model,int year){
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
	public void copy(car3 x) {
		this.setmake(x.getmake());
		this.setmodel(x.getmodel());
		this.setyear(x.getyear());
	}
	
}

public class copyObjects {
	public static void main(String[] args) {
	car3 car1 =new car3("tata","punch",2022);
	car3 car3 =new car3("ford"," jeep",3033);
	
	
	car3.copy(car1);
	
	System.out.println(car1);
	System.out.println(car3);
	System.out.println("\n");
	System.out.println(car1.getmake());
	System.out.println(car1.getmodel());
	System.out.println(car1.getyear());
	System.out.println("\n");
	System.out.println(car3.getmake());
	System.out.println(car3.getmodel());
	System.out.println(car3.getyear());
	
	}

}
