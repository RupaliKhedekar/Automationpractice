package day15inheritance;
//multilevel inheritance
class GrandFather{
	//default constructor
	void MyHome() {
		System.out.println("GrandFther Home");
	}
}
//father class is child class of grandfather class & parent class of child class 
class Father extends GrandFather{
	//default constructor with default super()
	
			//virtually available here - myHome()
	void MyCar() {
		System.out.println("Fther Car");
	}
}
//child class is child class of father class
class Child extends Father{
	//default constructor with default super()
	
		//virtually available here - myHome() & myCar()
	void MyBike() {
		System.out.println("Child Bike");
	}
}
public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Child c1=new Child();
		c1.MyBike();
		c1.MyCar();
		c1.MyHome();
		Father f1=new Father();
		f1.MyCar();
		f1.MyHome();
		System.out.println("Program Ends");
	}
	}
/*
Only non-static member are participating in inheritance


to achieve inheritance we need constructor chaining
	- when child class constructor calls parent class constructor and parent class constructor calls its parent class constructor
	  that is known as constructor chaining
	- this is possible by using super()
	- super()
		- its known as parent class instance
		- will help you to call immediate parent class constructor based on the parameter
	
Parent class-> super class/base class
child class -> subclass/inherited class

*/
