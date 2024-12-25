package day10methodstatic_nonstatic;

public class Example5 {
	static int rev=0;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		//method body will be executed and its return value is store in the variable for future use
		reverseNumber(562);
		System.out.println("Reverse number is: "+rev);
		System.out.println("Program Ends");
	}
	static void reverseNumber(int num) {
		int rem;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}

	}

}
