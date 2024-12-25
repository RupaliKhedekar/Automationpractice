package day8.operators;

public class Assignmentswap {

	public static void main(String[] args) {
		int x=100,y=200;
		System.out.println("Before swap");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swap");
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}

}
