package day11methodoverloading;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		main();
		System.out.println("Program Ends");
	}
	public static void main() {
		System.out.println("I am overloaded main...");
	}
}
