package day15inheritance;
//multilevel inheritance
class GrandFather2 {
	GrandFather2() {
		System.out.println("I am Grandfather cons...");
	}

	void MyHome() {
		System.out.println("GrandFther Home");
	}
}
//father class is child class of grandfather class & parent class of child class 
class Father2 extends GrandFather2 {
	Father2(int num) {
		// super(); compile will right by default super() due to inheritance
		System.out.println("I am father cons...");
	}

	// virtually available here - myHome()
	void MyCar() {
		System.out.println("Fther Car");
	}
}
//child class is child class of father class
class Child2 extends Father2 {
	Child2() {
		super(25);

		// explicitly super() should be written as Father class doesn;t have
		// default/zero param cons
		System.out.println("I am Child cons...");
	}

	// virtually available here - MyHome()& MyCar
	void MyBike() {
		System.out.println("Child Bike");
	}
}

public class Example4 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Child2 c1=new Child2();
		c1.MyBike();
		c1.MyCar();
		c1.MyHome();
		Father2 f1=new Father2(25);
		f1.MyCar();
		f1.MyHome();
		System.out.println("Program Ends");

	}

}
