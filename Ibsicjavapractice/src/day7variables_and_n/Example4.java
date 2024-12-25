package day7variables_and_n;

public class Example4 {
int num1=10,num2;
double num3;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		 //System.out.println("NSGV num1:"+num1); //compile time error, to access
		//any non-static variable 1st we need load them into the object memory
		//Example3 ref1;//object declaration
		//ref1=new Example3();//object initialization
		//or object declaration and initialization
		Example4 ref1=new Example4();//a copy of non static member will be loaded into object memory
System.out.println("NSGV num1:"+ref1.num1);
System.out.println("NSGV num2:"+ref1.num2);
System.out.println("NSGV num3:"+ref1.num3);
ref1.num2=55;
ref1.num3=4500.56;
ref1.num1=101;
System.out.println("NSGV num1:"+ref1.num1);
System.out.println("NSGV num2:"+ref1.num2);
System.out.println("NSGV num3:"+ref1.num3);
Example4 ref2=new Example4();//a copy of non static member will be loaded into object memory
//a change made in one instance won;t impact another object
System.out.println("NSGV num1:"+ref2.num1);
System.out.println("NSGV num2:"+ref2.num2);
System.out.println("NSGV num3:"+ref2.num3);
System.out.println("Program Ends");



System.out.println("Program Ends");

	}

}
