package day19_8thNov_Poli_Array;
// no Runtime polymorphism: because it required method overriding(here no method overriding)+inheritance+upcasting
class Bank1{
	void roi() {
		System.out.println("Bank roi is 10.56");
	}
}
class SBI1 extends Bank1{
	void HomeLoanroi() {
		System.out.println("SBI roi is 12.56");
	}
}
public class Example3 {

	public static void main(String[] args) {
		SBI ref1=new SBI();
		ref1.roi();
		Bank ref2=new SBI();
		ref2.roi();
		
		

	}
	

}
