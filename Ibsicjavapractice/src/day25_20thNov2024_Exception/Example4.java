package day25_20thNov2024_Exception;
//try block mai exception occured and not handled by catch block
public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 25, num2 = 0, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;// abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();//to get original exception message
		}
		System.out.println("Program ends");
	}
}
/**
in this case program will be terminated as catch block will not able to handle exception coming from try block
*/
