package day13this_block_final;

public class Example3 {

	Example3(){
		
		System.out.println("I am zero-param cons...");
	}
	Example3(int num){
		this(25.36);
		System.out.println(("I am int-param cons..."));
	}
	Example3(double num){
		this();
		System.out.println(("I am double-param cons..."));
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref1=new Example3(15);
		System.out.println("Program ends");

	}

}
