package day13this_block_final;

public class BlocksExample3 {
/*static block as well as constuctor should be or will be in class body and outside the method
 * we declaed not initialized  final global variables then we can initialized them as 
 * static block for final static variable
 * and non static block for final non static variable OR we can initialized NSGV in contructor also
 * static block get prints befor method
 * non-static block get prints before constuctor and then constructor print in method
 
 */
	BlocksExample3() {
		System.out.println("I am zero-param cons...");
		empId = 101;
	}

	static final int num1;
	final double salary;
	final int empId;

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("SGV num1:" + num1);//// we can access static variable directly as '+num'OR we can access
												//// them as per standards as classname.static
												//// variable'BlocksExample3.num1'
		BlocksExample3 ref = new BlocksExample3();
		System.out.println("NSIV salary:" + ref.salary);
		System.out.println("NSIV empId:"+ref.empId);
	/*	num1=500;
		ref.salary=50000.00;
		ref.empId=501;
		wfinal variable can;t be re-initialized
	*/	
		System.out.println("Program ends");

	}

	static {
		System.out.println("*****SIB-1******");
		num1 = 25;
	}
	{
		System.out.println("#######NSIB-1######");
		salary = 45000.366;
	}
}
