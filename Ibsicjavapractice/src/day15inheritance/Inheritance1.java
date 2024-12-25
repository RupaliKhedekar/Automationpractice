package day15inheritance;
class A1{
	//default constructor
	static int a=10;
	int b=20;
	double c=13.45;
	}
/*
 * B1: Child class/sub class/ derived class
 * A1: Parent class/ super class/ Inherited class
 * All the non-static member of A1 class will inherited into B1 class
 * (A1 non-static members will be present virtually in class B1)
 */
//B1 class is child class of A1 class & parent class of C1 class 
class B1 extends A1{
	//default constructor with default super statement
	static int x=30;
	/*
	 * These non-static member of A1 class are virtually present in B1 class
	 * int b=20;
	 * double c=13.45;
	 */
	int y=40;
	double z=53.45;
}
//C1 inherits class B1 non-static members & C1 class is child class of B1 class
class C1 extends B1 {
	//default constructor with default super statement
	static int p=50;
	/*
	 * These non-static member of B1 class are virtually present in C1 class
	 * int b=20;
	 * double c=13.45;
	 * int y=40;
	 * double z=53.45;
	 */
	int q=60;
	double r=66.45;
	}

public class Inheritance1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		/****************** Access static member class A1,B1,C1  *********************/
			System.out.println("Class A1 static variable a:"+A1.a);
			System.out.println("Class B1 static variable x:"+B1.x);
			System.out.println("Class C1 static variable p:"+C1.p);
		C1 c1=new C1();//by creating object of class C1 we can acces non static memeber of class A1,B1 & C1
		//because B1 class inherited by class C1 & A1 class inherited by class B1
		System.out.println("*******************************************");
		System.out.println("Class A1 Non-static variable b:"+c1.b);
		System.out.println("Class A1 Non-static variable c:"+c1.c);
		System.out.println("Class B1 Non-static variable x:"+c1.y);
		System.out.println("Class B1 Non-static variable z:"+c1.z);
		System.out.println("Class C1 Non-static variable q:"+c1.q);
		System.out.println("Class C1 Non-static variable r:"+c1.r);
		
		System.out.println("*******************************************");
		B1 b1=new B1();
		System.out.println("Class A1 Non-static variable b:"+b1.b);
		System.out.println("Class A1 Non-static variable c:"+b1.c);
		System.out.println("Class B1 Non-static variable x:"+b1.y);
		System.out.println("Class B1 Non-static variable z:"+b1.z);
		System.out.println("Pogram ends");
		
	}

}
/**
 * Inheritance:
 * when a child class inherit the property of it parent class known as Inheritance
 * representation: 
 * 					class childclassname extends parentclassname{
 * 						
 * 					}
 * Inheritance is achieved by using super() statement
 * 			--> used to call parent/super class constructor based on parameter
 * 			--> super() should be the first statement inside the constructor body
 * Note: In inheritance only non-static members involves 
 * 		 super() and this() can't be written together
 * 		- static members never participate in inheritance
 */
