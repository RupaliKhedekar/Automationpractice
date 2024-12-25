package day15inheritance;
class GrandFather3 {
	GrandFather3(int num) {
		System.out.println("I am Grandfather cons...");
	}

	void MyHome() {
		System.out.println("GrandFther Home");
	}
}
//father class is child class of grandfather class & parent class of child class 
class Father3 extends GrandFather2 {
	Father3() {
		
		
		System.out.println("I am father cons...");
	}

	// virtually available here - myHome()
	void MyCar() {
		System.out.println("Fther Car");
	}
}
//child class is child class of father class
class Child3 extends Father2 {
	Child3() {
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

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		Child3 c1=new Child3();
		c1.MyBike();
		c1.MyCar();
		c1.MyHome();
		Father3 f1=new Father3();
		f1.MyCar();
		f1.MyHome();
		System.out.println("Program Ends");

	}

}
