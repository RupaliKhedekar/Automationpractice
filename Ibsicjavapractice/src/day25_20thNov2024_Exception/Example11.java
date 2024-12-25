package day25_20thNov2024_Exception;
/*
 * finally block won't be executed in
	if JVM finds System.exit(0); statement before finally block
 */
public class Example11 {

	public static void main(String[] args) {
		int num1 = 25, num2 = 5, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;//  this not abnormal statement abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
			System.exit(0);// this will inform JVM that its end of the program, so terminate the execution
		}catch (ArithmeticException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();//to get original exception message
		}finally {
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
