package day25_20thNov2024_Exception;
//finally block: exception not handled by catch block
public class Example8 {

	public static void main(String[] args) {
		int num1 = 25, num2 = 0, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;// abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
		}catch (ArrayIndexOutOfBoundsException e) {
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
*/
