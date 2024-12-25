package day18_6thNov_encapsulation_typecasting;
class Sample{
	private int empId=10;
	private double salary=45000.56;
	/*
	 * Getter method:
	 * 		access modifier: public
	 * 		return type : based on type of variable you want to access
	 * 		name: any, but better to start with 'get'
	 * 		argument: NA
	 * 		return value: required private variable
	 */
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
	/*
	 * Setter method:
	 * 		access modifier: public
	 * 		return type : void
	 * 		name: any, but better to start with 'set'
	 * 		argument:  based on type of variable you want to access
	 * 		return value: NA 
	 */
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
public class Example1encapsulation {

	public static void main(String[] args) {
		Sample ref=new Sample();
//		System.out.println(ref.empId); // compile time error as these variables are declared as private 
//		System.out.println(ref.salary);// compile time error as these variables are declared as private 
		
		System.out.println(ref.getEmpId());
		System.out.println(ref.getSalary());
		
		ref.setEmpId(101);
		ref.setSalary(50000.556);
		System.out.println("Updated empID: "+ref.getEmpId());
		System.out.println("Updated Salary"+ref.getSalary());
	}

}
