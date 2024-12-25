package day25_20thNov2024_Exception;
//finally block won't be executed in:if exception occurred in finally block

public class Example12 {

	public static void main(String[] args) {
		int num1 = 25, num2 = 5, result;
		int[] num=new int[3];
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;//  this not abnormal statement /abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
		}catch (ArithmeticException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();//to get original exception message
		}finally {
			num[3]=25;//abnormal statement
			System.out.println("Welcome to finally block");
		}
		System.out.println("Program ends");
	}
}
/**
finally block:
	will be execute even 
		exception handled
		or not handled
		or no exception occurred in try block
		
finally block won't be executed in
	if JVM finds System.exit(0); statement before finally block
	if exception occurred in finally block
	if current thread is dead
*/
