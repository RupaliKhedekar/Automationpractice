package day14pyramidprogra;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		for (int i = 1; i <= 5; i++)// number row in pyramid
		{
			for (int j = 1; j <= i; j++)// column
			{
				System.out.print(i + " ");
			}
			System.out.println();

		}
		System.out.println("*********************");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("*********************");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println("*********************");
		for (int i = 5; i>=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("*********************");
		for (int i = 5; i>=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println("********A TO E**********");
		for (char ch = 'A'; ch<='E'; ch++) {
			for (char dh= 'A'; dh <= ch; dh++) {
				System.out.print(dh + " ");
				
			}

			System.out.println();
		}
		System.out.println("*********************");
		int k=1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}

			System.out.println();
		}
		System.out.println("Program ends");
	}
}
