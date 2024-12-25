package day10methodstatic_nonstatic;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		addNumbers();
		System.out.println("*************");
		addNumbers();
		System.out.println("*************");
		additionofTwoNumber(20,30);
		System.out.println("*************");
		additionofTwoNumber(50,-20);
		
		
		System.out.println("Program Ends");

	}
static void addNumbers() {
	int num1=20,num2=30,res=num1+num2;
	System.out.println("Number1 "+num1);
	System.out.println("Number2 "+num2);
	System.out.println("Result "+res);
}
static void additionofTwoNumber(int num1,int num2) {
	int res=num1+num2;
	System.out.println("Number1 "+num1);
	System.out.println("Number2 "+num2);
	System.out.println("Result "+res);
	
}
}
/*
WAP to two number

Function/method: contains set of repetitive statements which needs to executed based on the need
void: a method should be declared with void return type when we don't want to return any value to JVM

parameter/argument: when you want to perform some logical operation and every time you need new value dn its recommended
					use parameter
*/
