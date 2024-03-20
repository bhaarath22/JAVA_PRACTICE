// WAP IN JAVA to rando,lly manage employe records in terms of addition modification of records in random manner.
package toScratch;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class employeRecord {
public static void main(String[] args) throws IOException {
	FileWriter employerecords =new FileWriter("employeRecords");
employerecords.write("\n employe1 :age:23, salary:3200,name:rahul");
employerecords.write("\n employe1 :age:24, salary:30,name:raj");
employerecords.write("\n employe1 :age:25, salary:200,name:ravi");
employerecords.write("\n employe1 :age:26, salary:300,name:ram");

     Random random = new Random();
     int randomAction = random.nextInt(2); 
     
     if (randomAction == 0) {
         
         addEmployee(employerecords);
     } else {
         
         modifyEmployee(employerecords);
     }

     
     employerecords.close();
 }
public static void addEmployee(FileWriter employerecords )throws IOException  {
	int id = generateRandomId();
    int age = generateRandomAge();
    double salary = generateRandomSalary();
    String name = "Employee" + id;
    employerecords.write("\nEmployee" + id + ": age:" + age + ", salary:" + salary + ", name:" + name);

    System.out.println("Added new employee: " + name);
}

private static int generateRandomId() {
    
    return new Random().nextInt(1000);
}

private static int generateRandomAge() {
    return new Random().nextInt(21) + 20;
    
}

private static double generateRandomSalary() {
   
    return 3000 + new Random().nextDouble() * 2000;
}

private static void modifyEmployee(FileWriter employerecords) throws IOException {
    
    int employeeToModify = generateRandomId();

    int newAge = generateRandomAge();
    double newSalary = generateRandomSalary();

    
    employerecords.write("\nEmployee" + employeeToModify + ": age:" + newAge + ", salary:" + newSalary +
            ", name:modifiedname");

    System.out.println("Modified employee: Employee" + employeeToModify);
}

}








