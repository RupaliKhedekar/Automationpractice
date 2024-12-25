package day19_8thNov_Poli_Array;
//Compile time polymorphism:it required static method overloading
public class Example1 {

	public static void main(String[] args) {
		addition();
		addition(25,75);
		
		

	}
	static void addition() {
		int num1=10,num2=20,result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
	}
	static void addition(int num1,int num2) {
		int result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+result);
	}

}
/*Compile time polymorphism:
	When a method gets to know its implementation at the time of compilation is know as CTP.
*/
