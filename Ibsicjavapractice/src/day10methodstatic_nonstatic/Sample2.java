package day10methodstatic_nonstatic;

public class Sample2 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		demo();
		System.out.println("********************");
		Sample2.demo();
		System.out.println("*************************");
		Sample2.demo();
		System.out.println("Program ends");
	}
	public static void demo() {
		System.out.println("Welcome to atimation session");
		System.out.println("Your are learning corejava");
		System.out.println("After this will start selenium");
	}
	}

/* return type as void:
 * when you want to print some information and don't want to return any value
 */
