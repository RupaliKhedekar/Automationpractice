package day12Constructor;
//zero parameterized constructor
public class Example2 {
	Example2() {
		System.out.println("I am zero-param cons..");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 ref = new Example2();
		System.out.println("Program ends");

	}

}
