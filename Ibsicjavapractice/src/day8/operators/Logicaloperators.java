package day8.operators;

public class Logicaloperators {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=25,num2=35;
		boolean res1=(num1==num2);//f
		boolean res2=(num1!=num2);//t
		boolean res3=(res1 && res2);//f
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("res1:"+res1);
		System.out.println("res2:"+res2);
		System.out.println("Final Result:"+res3);
		System.out.println("Program Ends");
		System.out.println("***********************");
		System.out.println("Final Result:"+((num1!=num2) && (num1<=num2)));//t
		System.out.println("Final Result:"+((num1<num2) && (num1>num2)));//f
		System.out.println("Final Result:"+((num1==num2) || (num1!=num2)));//t
		System.out.println("Final Result:"+((num1>=num2) || (num1==num2)));//f
		System.out.println("Final Result:"+((num1<=num2) || (num1!=num2)));//t
		System.out.println("Program Ends");
		
	}

}
