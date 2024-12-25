package day22_14thNov24_Scanner_String;

import java.util.Scanner;

public class Sample5 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int empId;
		double salary;
		char grade;
		boolean status;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter empId: ");
		empId=s1.nextInt();
		System.out.println("Enter salary: ");
		salary=s1.nextDouble();
		System.out.println("Enter grade: ");
		grade=s1.next().charAt(0);
		System.out.println("Enter status: ");
		status=s1.nextBoolean();
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(grade);
		System.out.println(status);
		String name;
		System.out.println("Entre name:");
		name=s1.next();
		
}
}
