package day8.operators;

public class Increment_Decrement_operations {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=20;
		int num2=num1;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		int num3=++num1;//increment-<pre
		System.out.println("Number1:"+num1);//21
	    System.out.println("Number3:"+num3);//21
		num3=num1++;//increment post
		System.out.println("Number1:"+num1);//22
		System.out.println("Number3:"+num3);//21
		num1=10;
		num3=--num1;//decrement <pre
		System.out.println("Number1:"+num1);//9
		System.out.println("Number3:"+num3);//9
		num1=10;
		num3=num1--;//decrement-post
		System.out.println("Number1:"+num1);//9
		System.out.println("Number3:"+num3);//10
		System.out.println("Program Ends");
		
		
		
		

	}

}
