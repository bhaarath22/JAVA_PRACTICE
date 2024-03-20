	package fromScratch;

//import java.util.Scanner;
class circle1{
	private double radius =1.0;
	private String color ="red";
	
public	circle1(){
		
	}
public circle1(double radius){
		this.radius =radius;
	}
public	circle1(double r,String color){
		radius =r;
		this.color=color;
		
	}
	public  double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius =r;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color =c;
		
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public String toString() {
		return radius+ "  "+color+ " "+getArea();
	}
	
	
	
}
class cylinder12 extends circle1{
	private double height =1.0;
public	cylinder12(){
		
	}
	public cylinder12(double radius){
		super(radius);
		
	}
	public cylinder12(double radius,double height) {
		super(radius);
		this.height =height;
		
	}
	public cylinder12(double radius,double height,String color) {
		super(radius,color);
		this.height =height;
	}
	public double getheight() {
		return height;
		
	}
	public void setheight(double height) {
		this.height =height;
		
	}
	public double getVolume() {
		return getArea()*height;
	}
	
}

public class CircleCylinderInherit {
	public static void main(String[] args) {
		cylinder12 c1 =new cylinder12();
		cylinder12 c2 =new cylinder12(10.0);
		cylinder12 c3 =new cylinder12(2,10);
		circle1 c4 =new circle1();
		
	System.out.println(c1.getheight());
	System.out.println(c1.getRadius());
	System.out.println(c1.getVolume());
	System.out.println(c1.getArea());
		
	System.out.println("\n");
	System.out.println(c2.getheight());
	System.out.println(c2.getRadius());
	System.out.println(c2.getVolume());
	System.out.println(c2.getArea());
	
	System.out.println("\n");
	System.out.println(c3.getheight());
	System.out.println(c3.getRadius());
	System.out.println(c3.getVolume());
	System.out.println(c3.getArea());
		
	System.out.println("\n");
	System.out.println(c4.toString());
		
		
		
		
		
		
}}