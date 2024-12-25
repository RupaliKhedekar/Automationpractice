package day22_14thNov24_Scanner_String;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		char[] charArray=new char[5];
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<charArray.length;i++) {
			System.out.println("enter char at index "+i);
			charArray[i]=scn.next().charAt(0);
		}
		
		for(char ch:charArray) {
			System.out.println(ch);
		}
		System.out.println("Program ends");
	}
}