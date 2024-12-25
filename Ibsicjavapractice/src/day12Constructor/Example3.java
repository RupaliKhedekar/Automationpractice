package day12Constructor;

public class Example3 {
	// parameterized constructor

	Example3(int num) {
		System.out.println("I am int-param cons..");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref = new Example3(25);
		System.out.println("Program ends");

	}

}
