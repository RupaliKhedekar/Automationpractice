package day19_8thNov_Poli_Array;
class Example5 {
	int age;
	double salary;
	Example5(){
		System.out.println("Zero-param");
	}
	Example5(int a){
		age=a;
		System.out.println("int-param");
	}
	Example5(double a){
		salary=a;
		System.out.println("double-param");
	}
	void calling() {
		System.out.println("calling of Example1 class, age: "+age);
		System.out.println("calling of Example1 class, salary: "+salary);
	}
}
public class Array7 {
	public static void main(String args[]) {
				
		System.out.println("******************************");
		Example5 e2=new Example5();
		Example5 e3=new Example5(15);
		Example5 e4=new Example5(25.36);
		e2.calling();
		e3.calling();
		e4.calling();	

		System.out.println("*******************************");
//		Example5[] e=new Example5[] {new Example5(),new Example5(15),new Example5(25.36)};
			//or
//		Example5[] e={new Example5(),new Example5(15),new Example5(25.36)};
			//or
		Example5[] e=new Example5[3] ;
		e[0]=new Example5(); 		//e[0]=e2;
		e[1]=new Example5(15);		//e[1]=e3;
		e[2]=new Example5(25.36);	//e[2]=e4;
		
		e[0].calling();//e2.calling();
		e[1].calling();//e3.calling();
		e[2].calling();//e4.calling();			 	
		}
}
