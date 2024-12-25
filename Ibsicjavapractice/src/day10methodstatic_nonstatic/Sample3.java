package day10methodstatic_nonstatic;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		addition();
		addition();
		System.out.println(("******************"));
		additionOfTwoNumbers(10,20);
		additionOfTwoNumbers(101,209);
		System.out.println(("******************"));
		//checkeven(12);//it will execute method body but you won;t get its return value 
		
		//System.out.println("Is given number even ?"+checkeven(20));//it will execute method body but you won;t get its return value as well
		
		
		boolean result=checkeven(20);//it will execute method body and its return value will be stored for future use
		System.out.println("Result:"+result);
		System.out.println("Program ends");
	}
	static boolean checkeven(int num) {
		System.out.println("Given number is:"+num);
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
		}
	public static void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Result:"+res);
	}
	static void additionOfTwoNumbers(int num1,int num2) {
		int res=num1+num2;
		
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.out.println("Result:"+res);
	}

}
/* return type as void:
 * when you want to print some information and don't want to return any value
 
 parameter/argument:
 when you want to perform any logical operation and for each run you need fresh value
 */