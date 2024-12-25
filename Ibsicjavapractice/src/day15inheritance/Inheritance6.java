package day15inheritance;

//super class/ parent class / base class
class Grandfather101 {
	Grandfather101() {
		System.out.println("I am class Grandfather constructor...");
	}

	void myhome() {
		System.out.println("I am home of Grandfather");
	}
}

//subclass / child class / derived class
class father101 extends Grandfather101 {
	father101(double d) {
		// super();// if we dont wirte this dn java compiler will write by default
		// super()
		System.out.println("I am Class Father constrctuor...");
	}

	void mycar() {
		System.out.println("I am car of Father");
	}

}

class child101 extends father101 {
	child101(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor...");
	}

	void mybike() {
		System.out.println("I am bike of child");

	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		child101 c1 = new child101(21);// home, car & bike
		c1.myhome();
		c1.mycar();
		c1.mybike();
		System.out.println("*******************************************");
// creating an object or instance of child most class and referred by its parent
		//father f1=new father(254.1);
		//f1.mycar();f1.myhome();
		//father f2=child(25)//myHome,myCar,myBike
	//	f2.myhome();
	//	f2.mycar();
		//f1.myBike(); //error as its a property of child
				System.out.println("*******************************************");
				// creating an object or instance of child most class and referred by its parent
		Grandfather101 g1=c1;//Grandfather g1=c1=new 
	//	Child1(21); home but car & bike will not be visible/accessible to Grandfathe
	//g1.myHome();
//	g1.myCar();
//	g1.myBike();
		System.out.println("*******************************************");
	}
	}
/*
 * add debug point into the required steps
 * use following keys
 * 		f6	----> next line, execute current line and move next file
 * 		f5  ----> go inside the function
 * 		f8  ----> continue, to continue the normal execution flow
 * 		ctrl+shift+f ----> to check the variable value or method return value
 */
/*
 * statements are two type
 * 		1. Homogeneous :    LHS = RHS
 * 		2. Heterogeneous :  LHS != RHS
 * 
 * 			int age=20; // Homogeneous
 * 			double salary=25000; //Heterogeneous
 * 			
 * 			A a1 = new A();
 * 			A a2 = new B();
 * 			A a3 = a1;
 * 			B b1 = new B();
 * 			A a4 = b1;
 */ 
