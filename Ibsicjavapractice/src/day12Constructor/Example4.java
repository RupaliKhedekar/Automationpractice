package day12Constructor;

public class Example4 {
//zero parameterized constructor and parameterized constructor
	Example4() {
		System.out.println("I am zero-param cons..");
	}
	Example4(int num){
		System.out.println("I am int-param cons..");
	}
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example4 ref = new Example4();
		Example4 ref1 = new Example4(25);
		System.out.println("Program ends");
		

	}

}
