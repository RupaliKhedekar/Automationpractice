package day8.operators;

public class IfelseExample2 {

	public static void main(String[] args) {
	System.out.println("Program starts");
		int marks=34;
		if(marks>=35 && marks<=50) { 
			System.out.println("You have received 'C' garde");
		}
		else if (marks>=51 && marks<=72) {
			System.out.println("You have received 'B' grade ");
		}
		else if (marks>=72 && marks<=100) {
		
			System.out.println("You have received 'A' grade");
		}
		else { 
		    System.out.println("You are fail");
		}
		
			System.out.println("Program ends");
	

	}
}


	


/*
 * 35-50:C 51-72:B 71-100:A
 */

