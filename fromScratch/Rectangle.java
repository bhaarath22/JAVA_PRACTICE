package fromScratch;

public class Rectangle {
	
	    // Instance variables
	     double length;
	     double width;

	    // Constructor to initialize the rectangle with length and width
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Method to compute the area of the rectangle
	    public double computeArea() {
	        return length * width;
	        
	    } 

	    public static void main(String[] args) {
	        // Create a Rectangle object with length 5.0 and width 3.0
	        Rectangle rectangle = new Rectangle(5.0, 3.0);

	        // Compute and display the area of the rectangle
	        double area = rectangle.computeArea();
	       
	        System.out.println("Area of the rectangle: " + area);
	    }
	}


