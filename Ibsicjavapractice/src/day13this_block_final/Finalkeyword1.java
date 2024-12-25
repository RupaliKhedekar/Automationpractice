package day13this_block_final;

public class Finalkeyword1 {
	//final with local variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		final int num=10;
		System.out.println("Number is "+num);
		/*num=20;// compile time error occurs
		System.out.println("After 1st change number is:"+num);
		num=30; compile time error occurs
		System.out.println("After 2nd change number is:"+num);
		*/System.out.println("Program ends");

	}

}
