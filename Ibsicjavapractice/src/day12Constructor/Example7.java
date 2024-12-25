package day12Constructor;

public class Example7 {
	int age;

	Example7(int num) {
		System.out.println("I am int-param cons...");
		age = num;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example7 ref1 = new Example7(15);
		System.out.println("NSGV age with ref1:" + ref1.age);
		Example7 ref2 = new Example7(30);
		System.out.println("NSGV age with ref1:" + ref2.age);
		System.out.println("Program Ends");
	}
}
