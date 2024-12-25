package day13this_block_final;

public class BlocksExample1 {
	BlocksExample1() {
		System.out.println("I am zero-param cons...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		BlocksExample1 ref = new BlocksExample1();// this syntax to create object but you can call constructor only when
													// you create the object of class
		BlocksExample1 ref2 = new BlocksExample1();
		System.out.println("Program ends");

	}
//STATIC BLOCK EXECUTE FIRST THEN BODY EXECUTES
	static {
		System.out.println("*******SIB-1(STATIC INITIALIZATION BLOCK)*****");
	}
	//NON STATIC BLOCK EXECUTES BEFORE CONSTROCTUR AFTER THIS EXECUTES CONSTRUCTOR
	{System.out.println("######NSIB-1###########");
	}
	static {
		System.out.println("*******SIB-2(STATIC INITIALIZATION BLOCK)*****");
	}
	{System.out.println("######NSIB-2###########");
	}}
