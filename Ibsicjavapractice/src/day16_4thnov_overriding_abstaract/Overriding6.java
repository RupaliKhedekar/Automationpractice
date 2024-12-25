package day16_4thnov_overriding_abstaract;
class Parent2{
	// private methods are not overridden, because private member doesn't participate in inheritance
private void m1() {
	 System.out.println("From parent m1()");
}
protected void m2() {
	System.out.println("From parent m2()");
}
}
class Child2 extends Parent2{
	 // new m1() method no overriding here as its a private method, unique to Child class
	public void m1() {
		 System.out.println("From child m1()");
	}
	 // overriding method with more accessibility
    @Override
    protected void m2() {
    	System.out.println("From child m2()");
    }
}
//Driver class
class Overriding6 {

	public static void main(String[] args) {
		Parent2 obj1=new Parent2();
		obj1.m2();
		//obj1.m1();//compile time error as private members can;t be access from outside the class
		Parent2 obj2=new Child2();
		obj2.m2();
		Child2 obj3=new Child2();
		obj3.m2();
		obj3.m1();
		
		
		

	}

}