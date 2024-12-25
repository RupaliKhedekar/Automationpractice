package day7variables_and_n;

public class Example2 {
	static int num1 = 10, num2;
	static double num3;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("SGV num1:" + Example2.num1);
		System.out.println("SGV num2:" + Example2.num2);
		System.out.println("SGV num3:" + Example2.num3);
		int result;
		Example2.num2 = 55;
		result = Example2.num1 + Example2.num2;
		System.out.println("SGV num1:" + Example2.num1);
		System.out.println("SGV num2:" + Example2.num2);
		System.out.println("local result:" + result);
		System.out.println("Program Ends");

	}

}
