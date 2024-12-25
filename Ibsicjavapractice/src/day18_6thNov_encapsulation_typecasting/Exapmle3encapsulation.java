package day18_6thNov_encapsulation_typecasting;

class Sample2 {
	// Read only class
	private int empId = 10;
	private double salary = 45000.56;

	public int getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}
}

public class Exapmle3encapsulation {

	public static void main(String[] args) {
			Sample2 ref=new Sample2();
//			System.out.println(ref.empId); // compile time error as these variables are declared as private 
//			System.out.println(ref.salary);// compile time error as these variables are declared as private 
			
			System.out.println(ref.getEmpId());
			System.out.println(ref.getSalary());
	}
}
