package day7variables_and_n;

public class Example5 {
int num1=10,num2;
static int result;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example5 ref=new Example5();
		Example5.result=ref.num1+ref.num2;
		System.out.println("NSGV num1:"+ref.num1);
		System.out.println("NSGV num2:"+ref.num2);
		System.out.println("SGV Result:"+Example5.result);
		System.out.println("Program Ends");
		

	}

}
