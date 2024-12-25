package day13this_block_final;

public class Finalkyeword2 {
//final with local variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		final int num=10;
		System.out.println("Number is "+num);
//		num=20;
		 /* you have declared final num=10 and its final you cannot able to change/reinitialize it 
		because of final keywword if you try to reinitialize then you get compile time error
		OR YOU CAN SAY
		you will compile time error as variable declared as constant/final*/
		System.out.println("Program ends");
	}

}
