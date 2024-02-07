
/* 
 *  A project unit in a company wants to keep track of five employees in the project and their salaries, and also find out the average of their salaries. They also want to find the number of employees who get a salary greater than the average salary and those who get lesser.


 */
package tHaleyadhu;
public class trackOfEmploye {
public static void main(String[] args) {
	double[] salary =new double[]{23500.0,25080.0,28760.0,22340.0,19890.0};
	double sum=0;
	
	for(int i=0;i<salary.length;i++) {
		sum=sum+salary[i];
		
	}
	double average= sum/5;
	System.out.println("the average salary of all employess is:"+average);
	int salaryGreaterCount=0;
	int salaryLesserCount=0;
	for(int j=0;j<salary.length;j++) {
		if(salary[j]>average)
			salaryGreaterCount=1+salaryGreaterCount;
		else if(salary[j]<average)
			salaryLesserCount=1+salaryLesserCount;
	}
	System.out.println("no.of.employes getting salary less than average is: "+salaryLesserCount);
	System.out.println("no.of.employes getting salary less than average is: "+salaryGreaterCount);
	
	
}
}
