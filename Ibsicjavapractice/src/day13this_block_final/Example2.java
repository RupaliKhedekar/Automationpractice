package day13this_block_final;

public class Example2 {

	Example2(){
		this(25.36);
		System.out.println("I am zero-param cons...");
	}
	Example2(int num){
		
		System.out.println(("I am int-param cons..."));
	}
	Example2(double num){
		this(11);
		System.out.println(("I am double-param cons..."));
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 ref1=new Example2();
		System.out.println("Program ends");

	}

}
