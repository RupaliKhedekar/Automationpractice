package day7variables_and_n;

public class Example3 {
	int num1=10,num2;
	double num3;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		 //System.out.println("NSGV num1:"+num1); //compile time error, to access
		//any non-static variable 1st we need load them into the object memory
		//Example3 ref1;//object declaration
		//ref1=new Example3();//object initialization
		//or object declaration and initialization
		Example3 ref1=new Example3();//a copy of non static member will be loaded into object memory
System.out.println("NSGV num1:"+ref1.num1);
System.out.println("NSGV num2:"+ref1.num2);
System.out.println("NSGV num3:"+ref1.num3);
System.out.println("Program Ends");
		
		

	}

}
