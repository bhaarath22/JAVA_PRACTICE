package tHaleyadhu;
class Employee23{
	private int point;
	public int getpoint() {
		return point;
	}
	public void setpoint(int point) {
		this.point=point;
	}}
class employeeRating{
	private static final int Outstanding = 5;
	private static final int Good = 4;
	private static final int Average = 3;
	private static final int Poor = 2;

	static int calculatePerformace (Employee23 employee){ 
		if(employee.getpoint()>=80&&employee.getpoint()<=100)
			return Outstanding;
		else if(employee.getpoint()>=60&&employee.getpoint()<=79)
			return Good;
		else if(employee.getpoint()>=50&&employee.getpoint()<=59)
		return Average;
		else if (employee.getpoint()>=1&&employee.getpoint()<=49)
			return Poor;
		else 
			return 0;
	}
	
	
}
public class Employeeperformance {
	public static void main(String[] args) {
		Employee23 e1 = new Employee23();
		e1.setpoint(91);
		System.out.println("Your Performance is: " + employeeRating.calculatePerformace(e1));
}}
