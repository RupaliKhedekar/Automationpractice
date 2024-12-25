package day25_20thNov2024_Exception;
// exception because abnormal statement as nmber is divided 0 see othe progam 
public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int num1=25,num2=0,result;
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		result=num1/num2;//abnormal statement, which will terminate the program execution
		System.out.println("result : "+result);
		System.out.println("Program ends");
	}

}
