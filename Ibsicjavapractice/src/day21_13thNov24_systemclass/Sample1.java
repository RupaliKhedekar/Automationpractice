package day21_13thNov24_systemclass;

class Demo{
	void calling() {
		System.out.println("calling from Demo class");
	}
}
public class Sample1 {
	void display() {
		System.out.println("I am display of Sample1 class");
	}
	static Demo d2=new Demo();
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample1 ref=new Sample1();
		ref.display();
		
		Demo d1=new Demo();
		d1.calling();
		
		Sample1.d2.calling();
//classname.staticreferenceVariableOfDemo.nonstaticMethodOfDemoClass
		System.out.println("Program Ends");
//classname.staticReferenceVariableOfPrintStrem.nonstaticMethodOfPrintStreamclass
		
		System.err.println("I am an error msg");
	}

}
