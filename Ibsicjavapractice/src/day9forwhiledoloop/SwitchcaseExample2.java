package day9forwhiledoloop;

public class SwitchcaseExample2 {

	public static void main(String[] args) {
		char ops='/';
		int num1=10,num2=5,res;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
switch (ops) {
case'+':
	res=num1+num2;
	System.out.println("Addition result is:"+res);
	break;
case'-':
	res=num1-num2;
	System.out.println("Substraction result is:"+res);
	break;
case'*':
	res=num1*num2;
	System.out.println("Multipicatio result is:"+res);
	break;
case'/':
	res=(num1/num2);
	System.out.println("Dividation result is:"+res);
	break;
	
	default:
		System.out.println("Invalid operator");
}
	}

}
