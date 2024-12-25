package day12Constructor;

public class Example11 {

	int num=123;
	void calling() {
		System.out.println("NSGV Number is: "+num);
	}
	void calling(int num) {
		System.out.println("Local Number is: "+num);
//		Example11 r1=new Example11();
//		System.out.println("NSGV Number is: "+r1.num);
				//or
		System.out.println("NSGV Number is: "+this.num);
		System.out.println("this keyword value: "+this);
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example11 ref=new Example11();
		System.out.println("ref value: "+ref);
		ref.calling();
		ref.calling(25);
		System.out.println("Program ends");
		


	}

}
