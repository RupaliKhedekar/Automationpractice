package day16_4thnov_overriding_abstaract;
class ABC{
	void MyMethod() {
		System.out.println("method of ABC class");
	}
}

 class Overriding4 extends ABC {
	public void MyMethod() {
		// This will call the myMethod() of parent class
				super.MyMethod();
				System.out.println("Overriding method of Class Overriding4");
	}
 
	public static void main(String[] args) {
		Overriding4 obj=new Overriding4();
		obj.MyMethod();
		

	}

}
