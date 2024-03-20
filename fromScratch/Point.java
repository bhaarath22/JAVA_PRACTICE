package fromScratch;

 public class Point {
    private int x;
    private int y;

    // Constructor
  //  public
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods 
     int getX() {
        return x;
    }

     int getY() {
        return y;
    }

    // Setter methods
    void setX(int x) {
        this.x = x;
    }

     void setY(int y) {
        this.y = y;
    }
 // Method to move the point
    public void move(int dx,int dy) {
       this.x += dx;
        this.y += dy;
    }

    



    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point p2: (" + p2.getX() + ", " + p2.getY() + ")");

        p1.move(2, 6);
        System.out.println("Point p1 after moving: (" + p1.getX() + ", " + p1.getY() + ")");

        
    }
}
