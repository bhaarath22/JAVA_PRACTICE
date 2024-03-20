package fromScratch;
/*abstract class Shape{
	private String Color;
public 	Shape(String color) {
	Color =color;
}
abstract double getArea();
	public	String toString() {
		return Color;	
		}
	
}
class Rectangle1 extends Shape{
	private int Length;
	private int Width;
	Rectangle1(String color,int length,int width){
		super(color);
		Length =length;
		Width=width;
	}
	public double getArea() {
		return Length*Width;
	}
public	String toString() {
		return Length+ " "+Width;
	}

}
class Triangle1 extends Shape{
	private int Base;
	private int Height;
	Triangle1(String color,int base, int height){
		super(color);
		Base=base;
		Height=height;
	}
	
	public double getArea() {
		return 0.5*Base*Height;
	}
public	String toString() {
		return Base+" "+Height;
	}
}

public class AbstractShape {
	public static void main(String[] args) {
		Shape s1 =new Rectangle1("red" ,4,5);
		System.out.println(s1);
		System.out.println("Area of Rectangle:" +s1.getArea());
		System.out.println("\n");
		
		Shape t1 =new Triangle1("red" ,4,5);
		System.out.println(t1);
		System.out.println("Area of Triangle:" +t1.getArea());
	}

}    */
// @interface


interface Shape{
	
	
abstract double getArea();
	public	String toString() ;
	
	
}
class Rectangle1 implements Shape{
	private int Length;
	private int Width;
	Rectangle1(String color,int length,int width){
	//	super(color);
		Length =length;
		Width=width;
	}
	public double getArea() {
		return Length*Width;
	}
public	String toString() {
		return Length+ " "+Width;
	}

}
class Triangle1 implements Shape{
	private int Base;
	private int Height;
	Triangle1(String color,int base, int height){
	//	super(color);
		Base=base;
		Height=height;
	}
	
	public double getArea() {
		return 0.5*Base*Height;
	}
public	String toString() {
		return Base+" "+Height;
	}
}

public class AbstractShape {
	public static void main(String[] args) {
		Shape s1 =new Rectangle1("red" ,4,5);
		System.out.println(s1);
		System.out.println("Area of Rectangle:" +s1.getArea());
		System.out.println("\n");
		
		Shape t1 =new Triangle1("red" ,4,5);
		System.out.println(t1);
		System.out.println("Area of Triangle:" +t1.getArea());
		
		//Shape s3 =new Shape("green");//error
	}

}

