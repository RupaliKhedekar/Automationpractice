package day22_14thNov24_Scanner_String;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
//		int num1=10,num2=20,result;
//		System.out.println("Number1: "+num1);
//		System.out.println("Number2: "+num2);
//		result=num1+num2;
//		System.out.println("Result: "+result);
		
		int num1,num2,result;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		result=num1+num2;
		System.out.println("Result: "+result);
		System.out.println("Program ends");
	}
}