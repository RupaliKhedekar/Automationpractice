package day12Constructor;

public class Example9 {
	/*
	 * when static global variable name and static method local variable is same, dn
	 * in order to differentiate them we need to use classname 
	 */
	static int age;

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV Age:" + age);
		int age = 25;
		System.out.println("local Age:" + age);
		System.out.println("SGV Age:" + Example9.age);
		System.out.println("Program ends");

	}

}
