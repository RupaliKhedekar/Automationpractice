package day10methodstatic_nonstatic;

public class Sample5 {

	public static void main(String[] args) {
		System.out.println("Proram starts");
		// checkprime(12);it will print Given number is:12
		// boolean result=checkprime(20);it will print Given number is:20
		System.out.println("Is given number prime:" + checkprime(11));
		//getreversenumber(123);it will print only Initial number:123
		System.out.println("reversenumber:"+getreversenumber(123));
	    System.out.println("Program ends");

	}

	static boolean checkprime(int num) {
		System.out.println("Given number is:" + num);
		if (num % 2 == 0) {
			return true;
		} else {
			return false;

		}
	}
static int getreversenumber(int num) {
	int rem,rev=0;
	System.out.println("Initial number:"+num);
	for(;num>0;)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;
	
	
}
}
	

