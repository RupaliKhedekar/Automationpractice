package day12Constructor;

public class Example10 {
	int num=123;
		void calling() {
			System.out.println("NSGV Number is:"+num);
		}
		void calling(int num){
			System.out.println("local Number is :"+num);
		Example10 ref1=new Example10();
		System.out.println("NSGV Number is:"+ref1.num);
			}
		public static void main(String[] args) {
			System.out.println("Program starts");
			Example10 ref1=new Example10();
			 ref1.calling();
			ref1.calling(25);
			System.out.println("Program ends");
	}

}
