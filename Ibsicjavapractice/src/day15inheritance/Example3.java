package day15inheritance;
//multilevel inheritance
class GrandFather1{
	GrandFather1(){
		System.out.println("I am Grandfather1 cons...");
	}
	void MyHome() {
		System.out.println("GrandFther1 Home");
	}
}
//father class is child class of grandfather class & parent class of child class 
class Father1 extends GrandFather1{
	Father1(){
		//super(); compile will right by default super() due to inheritance
		System.out.println("I am father1 cons...");
	}
	//virtually available here - myHome()
	void MyCar() {
		System.out.println("Fther Car");
	}
}
//child class is child class of father class
class Child1 extends Father1{
	Child1(){
		//super(); compile will right by default super() due to inheritance
		System.out.println("I am Child cons...");
	}
	//virtually available here - MyHome()& MyCar
	void MyBike() {
		System.out.println("Child Bike");
	}
}

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Child1 c1=new Child1();
		c1.MyBike();
		c1.MyCar();
		c1.MyHome();
		Father1 f1=new Father1();
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