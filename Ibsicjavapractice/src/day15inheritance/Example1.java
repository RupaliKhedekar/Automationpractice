package day15inheritance;


class Sample1{
	int age=25;
	void calling() {
	System.out.println("Iam calling from Sample1 class");	
	}
}
class Sample2{
	int empId=123;
	void display() {
	System.out.println("Iam display from Sample2 class");	
	}
} 
public class Example1 {
	int salary;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample1 ref=new Sample1();
		ref.calling();
		Sample2 ref1=new Sample2();
		ref1.display();
		Example1 ref2=new Example1();
		System.out.println("Example1 Salary:"+ref2.salary);
		System.out.println("Program Ends");
		

	}

}
