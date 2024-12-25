package day13this_block_final;

public class Example1 {

	/*we have to creat no. of object as per no. of constructor to call constructor but in next program
	example2 we use this() staement and because of that we can call all constructor/or required constructor by using or by creating one sin
	single object
	*/
		Example1(){
			System.out.println("I am zero-param cons...");
		}
		Example1(int num){
			System.out.println(("I am int-param cons..."));
		}
		Example1(double num){
			System.out.println(("I am double-param cons..."));
		}
		public static void main(String[] args) {
			System.out.println("Program starts");
			Example1 ref1=new Example1();
			Example1 ref2=new Example1(12);
			Example1 ref3=new Example1(36.56);
			System.out.println("Program ends");
			
		
		

	}

}
