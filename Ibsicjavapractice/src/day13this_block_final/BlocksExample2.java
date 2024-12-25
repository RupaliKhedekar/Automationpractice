package day13this_block_final;

public class BlocksExample2 {
	BlocksExample2(){
	System.out.println("I am zero-param cons...");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		BlocksExample2 ref =new BlocksExample2();
		System.out.println("Program ends");

	}
static {
	System.out.println("*****SIB-1*******");
}
{
	System.out.println("#####NSIB-1#######");
	}
}
