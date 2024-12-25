package day25_20thNov2024_Exception;
//try block mai exception occured and handled by catch block
public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 25, num2 = 0, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;// abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("*****Exception handled*******");
//			System.out.println("Exception message: "+e.getMessage());// by zero
//			System.out.println("Exception class with message: "+e);//java.lang.ArithmeticException: / by zero
			e.printStackTrace();//to get original exception message
		}
		System.out.println("Program ends");
	}
}
/**
complete exception message:
		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at day17.exceptionhandling.Example1.main(Example1.java:10)

only message:
	/ by zero

Exception type along with message
	java.lang.ArithmeticException: / by zero


*/

