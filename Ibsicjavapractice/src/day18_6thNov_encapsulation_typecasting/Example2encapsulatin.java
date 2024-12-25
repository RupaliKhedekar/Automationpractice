package day18_6thNov_encapsulation_typecasting;
class Sample1{
	private int empId=10;
	private double salary=45000.56;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Example2encapsulatin {
	Sample1 ref=new Sample1();
//	System.out.println(ref.empId); // compile time error as these variables are declared as private 
//	System.out.println(ref.salary);// compile time error as these variables are declared as private 
	
	System.out.println(ref.getEmpId());
	System.out.println(ref.getSalary());
	
	ref.setEmpId(101);
	ref.setSalary(50000.556);
	System.out.println("Updated empID: "+ref.getEmpId());
	System.out.println("Updated Salary"+ref.getSalary());}
