package day10methodstatic_nonstatic;

public class ASSIGNMENT {

	public static void main(String[] args) {
		System.out.println("Proram starts");
		// checkprime(12);it will print Given number is:12
		// boolean result=checkprime(20);it will print Given number is:20
		System.out.println("Is given number prime:" + checkprime(20));
		System.out.println("Checking even number");
		getevennumber(10,20);
		System.out.println("Getpalindrome:"+getpalindrome(121));
;	    System.out.println("Program ends");
}

	static boolean checkprime(int num) {
		System.out.println("Given number is:" + num);
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
			}
	}
static void getevennumber (int num1,int num2) {
	
	for(;num1<=num2;num1++)
	if (num1%2==0) {
		System.out.println("Given number is:"+num1);
		
	}
	

}

static int getpalindrome(int num) {
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
//palindrome: any  number is same before and after reverse is called paindrome

	