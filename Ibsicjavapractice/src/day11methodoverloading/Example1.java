package day11methodoverloading;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		addition(25,75.36);
		addition();
		addition(25.36f,75.36);
		addition(25.36,75.36f);
		System.out.println("Program Ends");
	}
static void addition() {
	int num1=10,num2=20,res=num1+num2;
	System.out.println("Number1: "+num1);
	System.out.println("Number2: "+num2);
	System.out.println("Result: "+res);
}
static void addition(int num1,double num2) {
	double res=num1+num2;
	System.out.println("Number1: "+num1);
	System.out.println("Number2: "+num2);
	System.out.println("Result: "+res);
}
static void addition(float num1,double num2) {
	double res=num1+num2;
	System.out.println("Number1: "+num1);
	System.out.println("Number2: "+num2);
	System.out.println("Result: "+res);
}
static void addition(double num1,float num2) {
	double res=num1+num2;
	System.out.println("Number1: "+num1);
	System.out.println("Number2: "+num2);
	System.out.println("Result: "+res);
}
}
/*
when a class contains same method more than once with different set of parameter like-
	- diff type of paramter
	- diff in position of parameter
	- diff in number of parameter


*/