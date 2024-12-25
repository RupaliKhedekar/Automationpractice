package day25_20thNov2024_Exception;
//throw:
public class Example14 {


	public static void main(String[] args) {
		System.out.println("Program starts");
		checkAge(17);
		System.out.println("Program ends");
	}
	
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Sorry, you are not eligible for voting...");
		}else {
			System.out.println("Welcome, you can give your vote to your candidate...");
		}
	}
}
/**
throw: 
this will help programming to throw an exception explicitly based on his logic need
	this will use always inside the method body
	this will throw only one exeption at a time
*/
