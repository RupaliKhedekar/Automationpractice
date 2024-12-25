package day9forwhiledoloop;

public class ForloopExample2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		for(int i=1;i<=3;i++) {
			System.out.println(i+":Hello");
		}
		System.out.println("************print noumber from 1 to 5**********");
		for(int i=1;i<=5;i++) {
			System.out.print(i+"");
		}
		System.out.println("******print number from 5 to 1*****");
		for(int i=5;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println("********Print even number between 1 to 10*******");
		for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println("Given number is even number:"+i);
			}
		}
		System.out.println("********Print charachter from A to Z**********");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);//to print char on single line
	}
		System.out.println("********Print charachter from A to Z**********");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
			}
		System.out.println("\n*************print character from z to a*******");
		for(char ch='z';ch>='a';ch--) {
			System.out.print(ch+" ");
			}
		System.out.println("\n*******Print vowels between c to M****");
		for(char ch='C';ch<='M';ch++) {
		
		}

	}

}
