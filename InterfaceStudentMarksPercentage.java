package tHaleyadhu;
interface DataProvider{
	public int totalMaximumMarks=8000;
	public void calculatePercentage();
	public double getpercentage();
}


class intern implements DataProvider{
private int marksSecured;
private int gracemarks;
	int total=0;
	double maxpercentage=100;
	double percentage=0;
public intern(int marksSecured,int gracemarks) {
	this.marksSecured=marksSecured;
	this.gracemarks=gracemarks;
	total=marksSecured+gracemarks;
	if(total>totalMaximumMarks) {
		System.out.println("something went wrong plesea enter valid marks");
	}
	else {
		 getpercentage();
			
	}
}
	public void calculatePercentage() {
		total=marksSecured+gracemarks;
		percentage=((double)total*maxpercentage)/(double)totalMaximumMarks;
		
	}
public double getpercentage() {
	calculatePercentage();
	System.out.println("The total aggregate percentage secured is " + percentage + "%");
	return percentage;
	
}	
}

class trainee implements DataProvider{
private int marksSecured;
double maxPercentage=100;
double percentage=0;

public trainee(int marksSecured){
	this.marksSecured=marksSecured;
	if(marksSecured>totalMaximumMarks) {
		System.out.println("something went wrong please enter valid marks");}
	else 
		getpercentage();
	
}
	public void calculatePercentage() {
		percentage=((double)marksSecured*maxPercentage)/(double )totalMaximumMarks;
		
	}
	public double getpercentage() {
		calculatePercentage();
		System.out.println("The total aggregate percentage secured is " + percentage + "%");
		return percentage;
	}
	
}
public class InterfaceStudentMarksPercentage {
public static void main(String[] args) {
	DataProvider i1 = new intern(5000, 500);
	System.out.println();
	DataProvider t1 = new trainee(6000);
	System.out.println();
	
}
}
