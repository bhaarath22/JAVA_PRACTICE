package fromScratch;


	public class Person {
	    // Instance variables
	    private String name;
	    private int age;
	    private double salary;

	    // Constructor to initialize the instance variables
	    public Person(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Method to display person details
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: $" + salary);
	    }

	    public static void main(String[] args) {
	        // Create a Person object
	        Person person = new Person("vamshi", 19, 500);

	        // Display the person's details
	        System.out.println("Person Details:");
	        person.displayDetails();
	    }
	}


