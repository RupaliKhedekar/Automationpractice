package day8.operators;

public class Incrementdecrement_operation {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1 = 20;
		System.out.println("Number1:" + num1);
		int res = num1++ + num1 + ++num1;
		// initial res value 20+ 21 +22
		//final num1 value 21 21 22
		System.out.println("Number1:" + num1);
		System.out.println("Result:" + res);

		num1 = 10;
		res = --num1 + ++num1 + num1 + num1--;
		// initial res value 9+10+10+10
		//final num1 value 9+10+10+9
		System.out.println("Number1:" + num1);
		System.out.println("Result:" + res);
		num1 = 10;
		res = --num1 + num1-- + ++num1 + num1 + num1-- + ++num1;
		// initial res value 9+9+9+9+9+9
		//final num1 value     9+8+9+9+8+9
		System.out.println("Number1:"+num1);
		System.out.println("Result:"+res);
		System.out.println("Program ends");

	}

}
