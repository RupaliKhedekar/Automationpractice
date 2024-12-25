package day25_20thNov2024_Exception;
//unreachable code:line no 15 se line no. 24 tak comment kiya hai taki program mai error na aye
public class Example7 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 25, num2 = 0, result;
		System.out.println("Number1 : " + num1);
		System.out.println("Number2 : " + num2);
		try {
			result = num1 / num2;// abnormal statement, which will terminate the program execution
			System.out.println("result : " + result);
		} catch (Throwable e) {
			e.printStackTrace();
		} /*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();// to get original exception message
		} catch (NumberFormatException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();// to get original exception message
		} catch (ArithmeticException e) {
			System.out.println("*****Exception handled*******");
			e.printStackTrace();// to get original exception message
		}*/
		System.out.println("Program ends");
	}
}
/**
 * unreachable code:
 * 
 */