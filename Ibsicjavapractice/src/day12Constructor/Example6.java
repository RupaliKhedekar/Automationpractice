package day12Constructor;

public class Example6 {
//zero parameterized constructor
	// we can initialized non staic global variable in constructor
	// we can initialized non staic global variable in non-static method also
	int age;

	/*
	 * void calling() { System.out.println("NSGV"); age=25; }
	 */
	Example6() {
		System.out.println("I am zero-param cons...");
		age = 25;

	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example6 ref = new Example6();
		// ref.age=25;we can initialized non staic global variable here aslo
		// ref.calling();
		System.out.println("NSGV age;" + ref.age);
		System.out.println("Program Ends");

	}

}
