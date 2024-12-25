package day18_6thNov_encapsulation_typecasting;
class GrandFather{
	void myHome() {
		System.out.println("Grandfather home");
	}
}
class Father extends GrandFather{	
	//virtually available here - myHome()
	void myCar() {
		System.out.println("Father car");
	}
}
class Child extends Father{
	//virtually available here - myHome() & myCar()
	void myBike() {
		System.out.println("Child bike");
	}
}
public class Example5 {

	public static void main(String[] args) {
//		GrandFather g1=new GrandFather();
//		g1.myHome();
//		Father f1=new Father();
//		f1.myHome();
//		f1.myCar();
//		Child c1=new Child();
//		c1.myHome();
//		c1.myCar();
//		c1.myBike();
		
		GrandFather ref1=new Child();//upcasting - auto
		ref1.myHome();
		Father ref2=new Child();//upcasting - auto
		ref2.myHome();
		ref2.myCar();
		GrandFather ref3=new Father();//upcasting - auto
		ref3.myHome();
	}

}
