package day11methodoverloading;

public class Example3 {
	public static void main(String[] args) {
		Example3 ref=new Example3();
		ref.addition(25, 75.36);
		ref.addition();
		ref.addition(25.36f, 75.36);
		ref.addition(25.85, 75.36f);
	}
	void addition() {
		int num1=10,num2=20,res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(int num1,double num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(float num1,double num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
	void addition(double num1,float num2) {
		double res=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+res);
	}
}

