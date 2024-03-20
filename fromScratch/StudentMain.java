package fromScratch;


/*import java.util.Scanner;

//public
class MyNumber2 {
    private int num;
    
    public MyNumber2() {
        this.num = 0;
    }
    
    public MyNumber2(int num) {
        this.num = num;
    }
    
    public boolean isNegative() {
        return num < 0;
    }
    
    public boolean isPositive() {
        return num > 0;
    }
    
    public boolean isZero() {
        return num == 0;
    }
    
    public boolean isOdd() {
        return num % 2 != 0;
    }
    
    public boolean isEven() {
        return num % 2 == 0;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
}

public class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        MyNumber2 myNum = new MyNumber2(num);
        System.out.println("Number is: " + myNum.getNum());
        System.out.println("Is negative: " + myNum.isNegative());
        System.out.println("Is positive: " + myNum.isPositive());
        System.out.println("Is zero: " + myNum.isZero());
        System.out.println("Is odd: " + myNum.isOdd());
        System.out.println("Is even: " + myNum.isEven());
    }
} 


*/



 class Student {
    private int rollNumber;
    private String name;
    private double percentage;
    private static int objectCount = 0;
    
    public Student() {
        this.rollNumber = 0;
        this.name = "";
        this.percentage = 0.0;
        objectCount++;
    }
    
    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
        objectCount++;
    }
    
    public static int getObjectCount() {
        return objectCount;
    }
    
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Percentage: " + percentage;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John Doe", 85.0);
        System.out.println(s1);
        System.out.println("Object count: " + Student.getObjectCount());
        
        Student s2 = new Student(2, "Jane Smith", 92.5);
        System.out.println(s2);
        System.out.println("Object count: " + Student.getObjectCount());
    }
}





/*

 class Box {
    private double width;
    private double height;
    private double depth;
    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double Volume() {
        return width * height * depth;
    }
}

public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(5, 8, 9);
        
        double volume1 = box1.Volume();
        System.out.println("Volume of box1: " + volume1);
        
        double volume2 = box2.Volume();
        System.out.println("Volume of box2: " + volume2);
    }
}


*/
















