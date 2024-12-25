package day5variable;

public class Example5_variable {

	public static void main(String[] args) {
		// if you want to declare & initialize same type of multiple variable dn use

				int num1=10, num2=20, result=num1+num2;
				System.out.println("Number1:" + num1);
				System.out.println("Number2:" + num2);
				System.out.println("Addition Result:" + result);
				
				//re-initialization of result
				result=num2-num1;
		        System.out.println("Number1:" + num1);
				System.out.println("Number2:" + num2);
				System.out.println("Substraction Result:" + result);
				
				//re-initialization of result,num1
				num1=50;
				result=num2*num1;
				System.out.println("Number1:" + num1);
				System.out.println("Number2:" + num2);
				System.out.println("Multyplication Result:" + result);
				
				//re-initialization of result,num1,num2
				num1=105;
				num2=35;
				result=num1/num2;
				System.out.println("Number1:" + num1);
				System.out.println("Number2:" + num2);
				System.out.println("Division Result:" + result);
				
				//re-initialization of result,num2
				num2=25;
				result=num1%num2;
				System.out.println("Number1:" + num1);
				System.out.println("Number2:" + num2);
				System.out.println("Mod Result:" + result);
				
				/**
				 * complete number/complete number=complete number
				 * 105/25=4
				 * 
				 * incomplete number/complete number=incomplete number
				 *105.0/25=4.2
				 *
				 * complete number/incomplete number=incomplete number
				 *105/25.0=4.2
				 *
				 *incomplete number/incomplete number=incomplete number
				 *105.0/25.0=4.2
				 */
				
				System.out.println("Program Starts");
				//area=1/2*b*h;
				
				int b=10,h=20;
				double area;
				//area=1/2*h*h;//0
				//or
				//area=(1.0/2)*b*h;
				//or
				//area=(1/2.0)*b*h;
				//or
				area=0.5*b*h;
				System.out.println("b:"+b);
				System.out.println("h:"+h);
				System.out.println("area:"+area);
				System.out.println("Program Ends");
				
				
				
				
						
				
				
				
				
						
				
				
				
						
		
						
	}

}
