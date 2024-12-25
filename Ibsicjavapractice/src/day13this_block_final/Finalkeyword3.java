package day13this_block_final;

public class Finalkeyword3 {
	//final with ststic and non-static variable
	static final int num1=10;
	final  int num2=20;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//num1=29;you will get comile time error
		//num2=30;you will get comile time error
		System.out.println("SGV: "+Finalkeyword3.num1);
		Finalkeyword3 ref1=new Finalkeyword3();
		
		System.out.println("NSGV: "+ref1.num2);
		System.out.println("Program ends");

	}

}
