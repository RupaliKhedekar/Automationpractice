package day9forwhiledoloop;

public class ForloopExample3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("*******Print even number between 1 to 10*******");
// for(int i=1;i<=10;i++){
	//	if(i%2==0) {
//			System.out.println("Given number is even number:"+i);
			
//		}
//  }
		int i=1;
		for(;i<=10;) {
			if(i%2==0) {
				System.out.println("Given number is even number:"+i);
			}
			i++;
			}
		System.out.println("Program ends");
		
		
	}

}
