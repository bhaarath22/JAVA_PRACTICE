package practiceScratch;

class rectangle2{
	int length;
	int width;
	 void insert(int l,int w) {
		 length =l;
		 width =w;
		 
	 }
	 void Display() {
		 System.out.println("the area of the rectangle is:" +length*width);
		 
	 }
}



public class rectangleArea {
	public static void main(String args[]) {
		rectangle2 r1 = new rectangle2();
		rectangle2 r2 = new rectangle2();
		
		r1.insert(2, 3);
		r2.insert(3,2);
		r1.Display();
		r2.Display();
	}
	

}
