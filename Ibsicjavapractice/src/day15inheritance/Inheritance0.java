package day15inheritance;

class A {
	static int a=10;
	int b=20;
	double c=13.45;
	}
class B{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C {
	static int p=50;
	int q=60;
	double r=66.45;
	}

public class Inheritance0 {

	public static void main(String[] args) {
		System.out.println("Program starts");
	/****************** Access static member class A  *********************/
		System.out.println("Class A static variable a:"+A.a);
		 /******Access non-static members  of class A******/
		A a1=new A();
		System.out.println("Class A Non-static variable b:"+a1.b);
		System.out.println("Class A Non-static variable c:"+a1.c);
		
		/****************** Access static member class B  *********************/
		System.out.println("Class B static variable x:"+B.x);
		 /******Access non-static members  of class B******/
		B b1=new B();
		System.out.println("Class B Non-static variable y:"+b1.y);
		System.out.println("Class B Non-static variable z:"+b1.z);
		
		/****************** Access static member class C  *********************/
		System.out.println("Class C static variable:"+C.p);
		 /******Access non-static members  of class C******/
		C c1=new C();
		System.out.println("Class C Non-static variable:"+c1.q);
		System.out.println("Class C Non-static variable:"+c1.r);
		System.out.println("Program Ends");
		

	}

}
