package day10methodstatic_nonstatic;

public class Example4 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		reverseNumber(123);
		System.out.println("*******************************");
		reverseNumber(4567);
		System.out.println("********************************");
		//method body will be executed but you won;t be able to see return value in the console
			//getReverseNumber(562);
				//or
		//method body will be executed and you will be able to see return value in the console
			//System.out.println("Reverse number is: "+getReverseNumber(562));
				//or
		//method body will be executed and its return value is store in the variable for future use
		int rev=getReverseNumber(562);
		System.out.println("Reverse number is: "+rev);
		System.out.println("Program Ends");
	}
	static int getReverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	static void reverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
	}
}

