package day9forwhiledoloop;

public class DowhileLoopExample1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int i=10;
		// if condition fails, while won't be executed
		while(i<1) {
			System.out.println("While loop executes and i is :"+i);
			i++;
		}
			System.out.println("****do-while*****");
//even condition is failed, do-while will be executed at least once
			do{
				System.out.println("Do-While loop executed at least once");
			
			}while(i<1);
			System.out.println("Program ends");
			}
		

	}


