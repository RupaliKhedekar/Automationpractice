package day12Constructor;

public class Example8 {
	int age;
	double salary;
	Example8(){
		System.out.println("I am zero-param cons...");
	}
	Example8(double num2){
		System.out.println("I am double-param cons...");
	salary=num2;
	}
	Example8(int num1,double num2){
		System.out.println("I am int-duoble param cons...");
	age=num1;
	salary=num2;
	}
void display() {
	System.out.println("Printing NSGV values,age:"+age+"&salary:"+salary);;
}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example8 ref1=new Example8();
		ref1.display();
		Example8 ref2=new Example8(25);
		ref2.display();
		Example8 ref3=new Example8(25000.36);
		ref3.display();
		Example8 ref4=new Example8(25,25000.36);
		ref4.display();
		System.out.println("Program ends");

	}

}
