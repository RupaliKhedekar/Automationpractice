package day18_6thNov_encapsulation_typecasting;

public class Example4 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=25;
		
		long num2=num1;//widening - implicit/auto --> compiler will do--> long num2=(long)num1
		float num3=(float)num1;//widening - explicit
		double num4=num1;//widening - implicit/auto
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num3: "+num3);
		System.out.println("Num4: "+num4);
		
		double salary=45000.56;
		float num5=(float)salary;//narrowing - explicit --> loss in size
		long num6=(long)salary;//narrowing - explicit --> loss in value
		System.out.println("Salary: "+salary);
		System.out.println("num5: "+num5);
		System.out.println("num6: "+num6);
		System.out.println("Program ends");
	}

}
/*

byte<short<int<long<float<double

*/