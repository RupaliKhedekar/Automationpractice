package Practice301024;
class sample{
	void display() {
		System.out.println("i am display");
	}
	
}
public class Example1 extends sample{

	public static void main(String[] args) {
		sample s1=new sample();
		System.out.println("reference variable of Example1 class: "+s1);
		System.out.println(s1);
		System.out.println(s1.toString());
		sample s2=new sample();
		System.out.println(s1);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		Example1 ref2=new Example1();
		
		System.out.println("Program starts");

	}

}
