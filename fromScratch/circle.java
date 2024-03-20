package fromScratch;

  public class circle {
	  double x,y;
	   double r;
	   double circumference() {
		  return 2*3.14*r;
				  }
	   double area() {
		  return 3.14*r*r; 
	  }
	public static void main(String args[]) {
		circle acircle;
		acircle=new circle();
		acircle.x=10;
		acircle.y=20;
		acircle.r=5;
		double area =  acircle.area();
	
		double circumf= acircle.circumference();
				
		System.out.println("r ="+acircle.r+"Area="+area);
		System.out.println("r="+acircle.r+"circumference="+circumf);
	
	}
	} 


 /*package fromScratch;

import java.lang.Math;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

 
    	public Circle(Point center, double radius) {
     
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
        //return 3.14*radius*radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Point center = new Point(3.0, 4.0); 
        double radius = 5.0; 

        Circle circle = new Circle( 5);
        double area = circle.calculateArea();

        System.out.println("Circle Area: " + area);
    }
}
*/
  