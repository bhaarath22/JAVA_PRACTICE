package OOP;

 class food {
	 String name;
	 food(String name){
		 this.name=name;
	 }
	 

}
public class ArrayOfObjects{
	public static void main(String[] args) {
		// food dishes =new food[3];
		food food1= new food("pulihora");
		food food2 = new food("payasam");
		food food3 =new food("mutton");
		
		food[] dishes = {food1,food2,food3};
		// dishes[0]=food1;
		//dishes[1]=food2;
		//dishes[2]=food3;
		
		System.out.println(dishes[0].name);
		System.out.println(dishes[1].name);
		System.out.println(dishes[2].name);
	}
}
