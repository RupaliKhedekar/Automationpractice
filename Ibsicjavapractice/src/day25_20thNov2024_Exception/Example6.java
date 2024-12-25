package day25_20thNov2024_Exception;
//try block mai exception aya hi nahi then catch block execute nahi hoga
public class Example6 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 25, num2 = 5, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;// abnormal statement, which will terminate the program execution but in this  is not abnormal stateent so try and catch block not executed 
			System.out.println("result : " + result);
		}catch (ArithmeticException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();//to get original exception message
		}
		System.out.println("Program ends");
	}
}
/**
in this case program have no exception occurd because no abnormal statement
*/
