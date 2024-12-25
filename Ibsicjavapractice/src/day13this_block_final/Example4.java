package day13this_block_final;

public class Example4 {

Example4(){
	this(25);
		System.out.println("I am zero-param cons...");
	}
	Example4(int num){
		this(25.36);
		System.out.println(("I am int-param cons..."));
	}
	Example4(double num){
		
		System.out.println(("I am double-param cons..."));
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example4 ref1=new Example4();
		System.out.println("Program ends");

	}

}
